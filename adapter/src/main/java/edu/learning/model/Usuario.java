package edu.learning.model;

public class Usuario {
    
    private String nome;
    private String sobrenome;

    public Usuario(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }
    
}
