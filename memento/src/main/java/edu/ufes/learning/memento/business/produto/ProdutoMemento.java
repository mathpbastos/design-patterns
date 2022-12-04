package edu.ufes.learning.memento.business.produto;

public class ProdutoMemento {

	private String nome;
	private double preco;
	private double custo;
	
	public ProdutoMemento() {}
	
	ProdutoMemento(String nome, double preco, double custo) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.custo = custo;
	}
	
	String getNome() {
		return nome;
	}
	
	double getPreco() {
		return preco;
	}
	
	double getCusto() {
		return custo;
	}
	
}
