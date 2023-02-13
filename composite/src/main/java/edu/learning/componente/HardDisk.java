package edu.learning.componente;

public class HardDisk extends Componente{

    @Override
    public double getPrecoCusto() {
        return 50;
    }

    @Override
    public double getPrecoLucroMinimo() {
        return 70;
    }

    @Override
    public double getPrecoLucroMaximo() {
        return 100;
    }
    
}
