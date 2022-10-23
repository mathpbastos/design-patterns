package com.learning.dao.dao;

import com.learning.dao.conexao.ConexaoSQLite;
import com.learning.dao.model.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioSQLiteDAO implements IFuncionarioDAO{

    private Connection conexao;

    public FuncionarioSQLiteDAO() throws SQLException, ClassNotFoundException {
        this.conexao = ConexaoSQLite.conectar();
    }
    
    @Override
    public void salvar(Funcionario funcionario) throws SQLException{
        PreparedStatement ps = null;
        
        if(funcionario == null) {
            throw new RuntimeException("O funcionário não pode estar nulo.");
        }
        
        try {
            String query = "INSERT INTO funcionarios"
                + "(id, nome, cargo, salario_base)"
                + "values (?, ?, ?, ?);";
            
            ps = conexao.prepareStatement(query);
            ps.setLong(1, funcionario.getId());
            ps.setString(2, funcionario.getNome());
            ps.setString(3, funcionario.getCargo());
            ps.setDouble(4, funcionario.getSalarioBase());
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            throw new SQLException("Erro ao salvar o funcionário\n" + ex.getMessage());
        } finally {
            ConexaoSQLite.fecharConexao(conexao, ps);
        }       
    }

    @Override
    public Funcionario getById(long id) throws SQLException{
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            String query = "SELECT * FROM funcionarios "
                    + "WHERE id = ?;";
            ps = conexao.prepareStatement(query);
            ps.setLong(1, id);
            rs = ps.executeQuery();
            if(!rs.next())
                throw new SQLException("Usuário com id " + id + "não encontrado.");
            
            long funcId = rs.getLong(1);
            String nome = rs.getString(2);
            String cargo = rs.getString(3);
            Double salarioBase = rs.getDouble(4);
            
            return new Funcionario(funcId, nome, cargo, salarioBase);
        } catch (SQLException ex) {
            throw new SQLException("Erro ao buscar o funcionário.\n" + ex.getMessage());
        } finally {
            ConexaoSQLite.fecharConexao(conexao, ps, rs);
        }
        
    }

    @Override
    public List<Funcionario> getByNome(String nome) throws SQLException{
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Funcionario> lista = new ArrayList<>();
        try {            
            String query = "SELECT * FROM funcionarios WHERE nome = ? "
                    + "ORDER BY id;";
            ps = conexao.prepareStatement(query);
            ps.setString(1, nome);
            rs = ps.executeQuery();
            
            if(!rs.next())
                throw new SQLException("Nenhum funcionário com nome " + nome 
                        + " encontrado.");
            
            do{
                long id = rs.getLong(1);
                String nomeFuncionario = rs.getString(2);
                String cargo = rs.getString(3);
                Double salarioBase = rs.getDouble(4);
                
                lista.add(new Funcionario(id, nomeFuncionario, cargo, salarioBase));
            } while(rs.next());
            return lista;
        } catch (SQLException ex) {
            throw new SQLException("Erro ao buscar funcionários.\n" + ex.getMessage());
        } finally{
            ConexaoSQLite.fecharConexao(conexao, ps, rs);
        }
    }

    @Override
    public boolean delete(long id) throws SQLException{
        PreparedStatement ps = null;  
        try {
            String query = "DELETE FROM funcionarios WHERE id = ?;";
            ps = conexao.prepareStatement(query);
            ps.setLong(1, id);
            ps.executeUpdate();
            
            return true;
        } catch (SQLException ex) {
            throw new SQLException("Erro ao deletar o funcionário.\n" +  ex.getMessage());
        } finally{
            ConexaoSQLite.fecharConexao(conexao, ps);
        }
    }

    @Override
    public List<Funcionario> getAll() throws SQLException{
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Funcionario> lista = new ArrayList<>();
        try{
            String query = "SELECT * FROM funcionarios ORDER BY id;";
            ps = conexao.prepareStatement(query);
            rs = ps.executeQuery();
            
            if(!rs.next())
                throw new SQLException("Não há funcionários cadastrados.");
            
            do{
                long id = rs.getLong(1);
                String nome = rs.getString(2);
                String cargo = rs.getString(3);
                double salarioBase = rs.getDouble(4);
                
                lista.add(new Funcionario(id, nome, cargo, salarioBase));
            } while(rs.next());
            
            return lista; 
        } catch (SQLException ex){
            throw new SQLException("Erro ao buscar os funcionários. \n" + ex.getMessage());
        } finally {
            ConexaoSQLite.fecharConexao(conexao, ps, rs);
        }
        
    }
    
}
