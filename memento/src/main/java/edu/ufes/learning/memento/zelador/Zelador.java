package edu.ufes.learning.memento.zelador;

import java.util.Stack;

import edu.ufes.learning.memento.business.produto.ProdutoMemento;

public class Zelador {

	protected final Stack<ProdutoMemento> estadosDesfazer;
	protected final Stack<ProdutoMemento> estadosRefazer;
	private final int tamanho;
	private static Zelador instancia;
	
	private Zelador(int tamanho) {
		this.tamanho = tamanho;
		this.estadosDesfazer = new Stack<ProdutoMemento>();
		this.estadosRefazer = new Stack<ProdutoMemento>();
	}
	
	public static Zelador getInstancia(int tamanho) {
		if(instancia == null) 
			instancia = new Zelador(tamanho);
		
		return instancia;
	}
	
	public void addDesfazer(ProdutoMemento memento) {
		if(this.estadosDesfazer.size() == tamanho)
			this.estadosDesfazer.removeElementAt(0);
		this.estadosDesfazer.push(memento);
	}
	
	private void addRefazer(ProdutoMemento memento) {
		if(this.estadosRefazer.size() == tamanho)
			this.estadosRefazer.removeElementAt(0);
		this.estadosRefazer.push(memento);
	}
	
	public ProdutoMemento getUltimoEstado() {
		if(this.estadosDesfazer.empty())
			throw new RuntimeException("Não há estados salvos.");
		
		addRefazer(this.estadosDesfazer.peek());
		
		return this.estadosDesfazer.pop();
	}
	
	public ProdutoMemento getProximoEstado() {
		if(this.estadosRefazer.isEmpty())
			throw new RuntimeException("Não há estados salvos.");
		
		addDesfazer(this.estadosRefazer.peek());
		
		return this.estadosRefazer.pop();
	}
	
}
