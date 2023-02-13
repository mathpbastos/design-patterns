package edu.learning.template;

public class Cafe extends BebidaQuente{

    @Override
    protected void dispensarMistura() {
        System.out.println("Adicionando pó de café...");
    }

    @Override
    protected void adicionarCondimentos() {
        System.out.println("Adicionando creme e açúcar...");
    }
    
}
