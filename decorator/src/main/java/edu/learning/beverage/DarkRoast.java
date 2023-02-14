package edu.learning.beverage;

import edu.learning.beverage.Beverage;

public class DarkRoast extends Beverage{

    public DarkRoast() {
        this.description = "Dark Roast";
    }

    @Override
    public double cost() {
        return .99;
    }
    
}
