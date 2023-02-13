package edu.learning.model.produto;


public class MementoProduto {
    
    private double preco;
    private String descricao;

    protected MementoProduto(double preco, String descricao) {
        this.preco = preco;
        this.descricao = descricao;
    }

    protected double getPreco() {
        return preco;
    }

    protected String getDescricao() {
        return descricao;
    }

}
