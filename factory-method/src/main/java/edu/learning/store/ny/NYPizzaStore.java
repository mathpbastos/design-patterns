package edu.learning.store.ny;

import edu.learning.model.Pizza;
import edu.learning.store.PizzaStore;

public class NYPizzaStore extends PizzaStore{

    @Override
    public Pizza createPizza(String type) {
        if(type.equalsIgnoreCase("cheese")){
            return new NYCheesePizza();
        }
        
        return null;
    }
    
}
