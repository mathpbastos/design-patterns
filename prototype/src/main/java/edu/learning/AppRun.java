package edu.learning;

import edu.learning.prototype.CarroPrototype;
import edu.learning.prototype.FiestaPrototype;

public class AppRun {

    public static void main(String[] args) throws CloneNotSupportedException {
        
        FiestaPrototype fiestaPrototype = new FiestaPrototype();
        
        CarroPrototype novo = fiestaPrototype.clone();
        novo.setValorCompra(27900.0);
        System.out.println(novo);
        
    }
}
