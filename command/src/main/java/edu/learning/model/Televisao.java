package edu.learning.model;

public class Televisao {
    
    private boolean power;
    
    public void ligar(){
        this.power = true;
        System.out.println("Televisão ligada.");
    }
    
    public void desligar(){
        this.power = false;
        System.out.println("Televisão desligada.");
    }
}
