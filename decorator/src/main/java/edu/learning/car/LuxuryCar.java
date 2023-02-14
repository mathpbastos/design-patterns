package edu.learning.car;

public class LuxuryCar extends CarDecorator{

    public LuxuryCar(ICar car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding luxury car features...");
    }
    
    
}
