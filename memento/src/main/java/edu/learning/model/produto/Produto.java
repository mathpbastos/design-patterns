package edu.learning.model.produto;


public class Produto {
    
    private String descricao;
    private double preco;

    public Produto(String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public MementoProduto getMemento(){
        return new MementoProduto(this.preco, this.descricao);
    }
    
    public void restaurar(MementoProduto memento){
        this.setDescricao(memento.getDescricao());
        this.setPreco(memento.getPreco());
    }
    
}
