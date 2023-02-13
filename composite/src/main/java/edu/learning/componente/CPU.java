package edu.learning.componente;

public class CPU extends Componente{

    @Override
    public double getPrecoCusto() {
        return 100;
    }

    @Override
    public double getPrecoLucroMinimo() {
        return 150;
    }

    @Override
    public double getPrecoLucroMaximo() {
        return 200;
    }
    
}
