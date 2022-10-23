package com.learning.dao.dao;

import com.learning.dao.model.Funcionario;
import java.sql.SQLException;
import java.util.List;

public interface IFuncionarioDAO {
    
    public void salvar(Funcionario funcionario) throws SQLException;
    public Funcionario getById(long id) throws SQLException;
    public List<Funcionario> getByNome(String nome) throws SQLException;
    public boolean delete(long id) throws SQLException;
    public List<Funcionario> getAll() throws SQLException;
    
}
