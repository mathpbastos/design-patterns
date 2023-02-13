package edu.learning;

import edu.learning.memento.ZeladorProduto;
import edu.learning.model.produto.Produto;

public class AppRun {

    public static void main(String[] args) {
        
        Produto p = new Produto("Caixa de som", 23.44);
        
        ZeladorProduto.adicionarMemento(p.getMemento());
        
        System.out.println("Estado Anterior:\n"
                + "Descrição: " + p.getDescricao()
                + "\nPreço: " + p.getPreco());
        
        p.setPreco(44.44);
        p.setDescricao("Teclado Wireless");
        
        System.out.println("Novo Estado:\n"
                + "Descrição: " + p.getDescricao()
                + "\nPreço: " + p.getPreco());
        
        p.restaurar(ZeladorProduto.getUltimoMemento());
        
        System.out.println("Estado Restaurado:\n"
                + "Descrição: " + p.getDescricao()
                + "\nPreço: " + p.getPreco());
    }
}
