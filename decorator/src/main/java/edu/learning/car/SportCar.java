package edu.learning.car;

public class SportCar extends CarDecorator{

    public SportCar(ICar car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding sports car features...");
    }
    
    
    
}
