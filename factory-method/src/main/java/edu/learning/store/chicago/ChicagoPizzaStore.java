package edu.learning.store.chicago;

import edu.learning.model.Pizza;
import edu.learning.store.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore{

    @Override
    public Pizza createPizza(String type) {
        if(type.equalsIgnoreCase("cheese")){
            return new ChicagoCheesePizza();
        }
        
        return null;
    }

}
