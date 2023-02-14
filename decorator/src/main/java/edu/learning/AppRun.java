package edu.learning;

import edu.learning.car.BasicCar;
import edu.learning.car.ICar;
import edu.learning.car.LuxuryCar;
import edu.learning.car.SportCar;

public class AppRun {

    public static void main(String[] args) {
        
        /*
        // Beverage Tests
        Beverage beverage = new Espresso();
        
        System.out.println(beverage.getDescription() + "\t $ " 
                + beverage.cost());
        
        beverage = new Mocha(beverage);
        beverage = new SteamedMilk(beverage);
        
        System.out.println(beverage.getDescription() + "\t $ " 
                + beverage.cost());
        */
        
        ICar car = new BasicCar();
        
        car = new LuxuryCar(car);
        car = new SportCar(car);
        
        car.assemble();
        
    }
}
