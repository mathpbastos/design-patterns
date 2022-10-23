package com.learning.dao.run;

import com.learning.dao.dao.FuncionarioSQLiteDAO;
import com.learning.dao.dao.IFuncionarioDAO;
import com.learning.dao.model.Funcionario;
import java.sql.SQLException;
import java.util.List;

public class DaoRun{
    
    public static void main(String[] args) {
        try {
            IFuncionarioDAO dao = new FuncionarioSQLiteDAO();
            
            /*Funcionario f = new Funcionario(1, "Joana", "Secretaria", 3000.10);
            
            dao.salvar(f);*/
            
            
            //List<Funcionario> lista = dao.getAll();
            List<Funcionario> lista = dao.getByNome("Maria");

            
            for(Funcionario f : lista){
                System.out.println("Id: " + f.getId());
                System.out.println("Nome: " + f.getNome());
                System.out.println("Cargo: " + f.getCargo());
                System.out.println("Salario Base: " + f.getSalarioBase());
            }
            
        } catch (SQLException ex) {
            System.out.println("ERRO -> " + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println("ERRO -> " + ex.getMessage());
        }
    }
    
}
