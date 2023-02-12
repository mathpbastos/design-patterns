package edu.learning.store;

import edu.learning.model.Pizza;

public abstract class PizzaStore {
      
    public final Pizza orderPizza(String type){
        
        Pizza pizza = createPizza(type);
        
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        
        return pizza;
        
    }
    
    public abstract Pizza createPizza(String type);
    
}
