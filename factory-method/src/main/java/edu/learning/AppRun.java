package edu.learning;

import edu.learning.model.Pizza;
import edu.learning.store.PizzaStore;
import edu.learning.store.chicago.ChicagoPizzaStore;

public class AppRun {

    public static void main(String[] args) {
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        
        Pizza pizza = chicagoStore.orderPizza("cHeeSe");
        
        System.out.println("Someone has ordered a " + pizza.getName());
        
    }
}
