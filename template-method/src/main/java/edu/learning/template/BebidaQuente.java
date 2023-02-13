package edu.learning.template;

public abstract class BebidaQuente {
    
    // Template Method
    public final void preparar() {
        ferverAgua();
        dispensarMistura();
        porNoCopo();
        adicionarCondimentos();
        
        System.out.println("Bebida pronta.");
    }
    
    protected final void ferverAgua(){
        System.out.println("Fervendo água...");
    }
    
    protected final void porNoCopo(){
        System.out.println("Colocando bebida no copo...");
    }
    
    protected abstract void dispensarMistura();
    
    protected abstract void adicionarCondimentos();
    
}
