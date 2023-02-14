package edu.learning.beverage;

import edu.learning.beverage.Beverage;

public class Decaf extends Beverage {

    public Decaf() {
        this.description = "Decaf";
    }
    
    public double cost(){
        return 1.05;
    }
    
}
