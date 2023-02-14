package edu.learning.beverage;

public abstract class CondimentDecorator extends Beverage{
    
    Beverage beverage;
    
    public abstract String getDescription();
    
}
