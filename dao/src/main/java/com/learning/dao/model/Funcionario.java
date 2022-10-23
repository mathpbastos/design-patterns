package com.learning.dao.model;

public class Funcionario {
    private long id;
    private String nome;
    private String cargo;
    private double salarioBase;

    public Funcionario(long id, String nome, String cargo, double salarioBase) {
        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
        this.salarioBase = salarioBase;
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
    
    
}
