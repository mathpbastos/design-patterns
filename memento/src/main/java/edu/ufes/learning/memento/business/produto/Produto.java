package edu.ufes.learning.memento.business.produto;

public class Produto {

	private String nome;
	private double preco;
	private double custo;
	
	public Produto() {}

	public Produto(String nome, double preco, double custo) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.custo = custo;
	}
	
	public ProdutoMemento getMemento() {
		return new ProdutoMemento(this.nome, this.preco, this.custo);
	}
	
	public void restaurar(ProdutoMemento memento) {
		this.nome = memento.getNome();
		this.preco = memento.getPreco();
		this.custo = memento.getCusto();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getCusto() {
		return custo;
	}

	public void setCusto(double custo) {
		this.custo = custo;
	}
	
	
	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
        return "Produto{"
        		+ "\nNome: " + nome
        		+ "\nCusto: " + custo
        		+ "\nPreco: " + preco 
        		+ "\n}";
    }
	
}
