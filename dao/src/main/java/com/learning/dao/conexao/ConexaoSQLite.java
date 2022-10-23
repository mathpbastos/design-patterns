package com.learning.dao.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexaoSQLite {
    
    public static Connection conectar() throws ClassNotFoundException, SQLException{
        Connection conexao = null;
        try {
            Class.forName("org.sqlite.JDBC");
            try {
                conexao = DriverManager.getConnection("jdbc:sqlite:/home/b1n/codes/java/dao/db/daoDB.db");
            } catch (SQLException ex) {
                throw new SQLException("Erro de conexão.\n" + ex.getMessage());
            }
        } catch (ClassNotFoundException ex) {
            throw new ClassNotFoundException("Erro - Não foi possível encontrar"
                    + "a classe para conectar ao banco.\n" + ex.getMessage());
        }
        return conexao;
    }
    
    public static void fecharConexao(Connection conexao) throws SQLException{
        try {
            if(conexao != null)
                conexao.close();
        } catch (SQLException ex) {
            throw new SQLException("Erro ao encerrar as conexões" + ex.getMessage());
        }
    }
    
    public static void fecharConexao(Connection conexao, Statement stmt) throws SQLException{
        try {
            if(conexao != null)
                conexao.close();
            if(stmt != null)
                stmt.close();
        } catch (SQLException ex) {
            throw new SQLException("Erro ao encerrar as conexões" + ex.getMessage());
        }
    }
    
    public static void fecharConexao(Connection conexao, Statement stmt, ResultSet rs) throws SQLException{
        try {
            if(rs != null)
                rs.close();
            if(stmt != null)
                stmt.close();
            if(conexao != null)
                conexao.close();
        } catch (SQLException ex) {
            throw new SQLException("Erro ao encerrar as conexões" + ex.getMessage());
        }
    }    
}
