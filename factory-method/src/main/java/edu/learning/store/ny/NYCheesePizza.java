package edu.learning.store.ny;

import edu.learning.model.Pizza;

public class NYCheesePizza extends Pizza{
    
    public NYCheesePizza(){
       this.setName("NY Style Sauce and Cheese Pizza");
       this.setDough("Thin Crust Dough");
       this.setSauce("Marinara Sauce");
       
       this.addTopping("Grated Reggiano Cheese");
    }
    
}
