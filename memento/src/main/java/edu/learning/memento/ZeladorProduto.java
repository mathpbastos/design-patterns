package edu.learning.memento;

import edu.learning.model.produto.MementoProduto;
import java.util.Stack;

public class ZeladorProduto {
    
    private static Stack<MementoProduto> mementos = new Stack();
    
    public static final void adicionarMemento(MementoProduto memento){
        mementos.add(memento);
    }
    
    public static final MementoProduto getUltimoMemento(){
        return mementos.pop();
    }
    
}
