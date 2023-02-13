package edu.learning.template;

public class Cha extends BebidaQuente {

    @Override
    protected void dispensarMistura() {
        System.out.println("Adicionando ervas...");
    }

    @Override
    protected void adicionarCondimentos() {
        System.out.println("Adicionando adoçante...");
    }
    
}
