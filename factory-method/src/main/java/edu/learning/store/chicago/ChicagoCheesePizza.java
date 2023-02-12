package edu.learning.store.chicago;

import edu.learning.model.Pizza;

public class ChicagoCheesePizza extends Pizza{
    
    public ChicagoCheesePizza(){
        this.setName("Chicago Style Deep Dish Cheese Pizza");
        this.setDough("Extra Thick Crust Dough");
        this.setSauce("Plum Tomato Sauce");
        
        this.addTopping("Shredded Mozzarella Cheese");
    }

    @Override
    public void cut() {
        System.out.println("Cutting pizza into square slices");
    }
    
    
    
}
