package edu.ufes.learning.memento;

import edu.ufes.learning.memento.business.produto.Produto;
import edu.ufes.learning.memento.zelador.Zelador;

public class App {
    public static void main( String[] args ) {
    	
    	Zelador z = Zelador.getInstancia(5);
    	
    	Produto p1 = new Produto("PC", 1200d, 1300d);
    	z.addDesfazer(p1.getMemento());
    	
    	p1.setNome("Alterei nome 1");    	
    	z.addDesfazer(p1.getMemento());
    	p1.setNome("Alterei nome 2"); 
    	z.addDesfazer(p1.getMemento());
    	p1.restaurar(z.getUltimoEstado());
    	p1.restaurar(z.getUltimoEstado());
    	p1.restaurar(z.getProximoEstado());
    	p1.restaurar(z.getProximoEstado());
    	
    	System.out.println(p1.getNome().equalsIgnoreCase("alterei nome 2"));

    }
}
