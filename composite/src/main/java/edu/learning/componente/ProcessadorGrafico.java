package edu.learning.componente;

public class ProcessadorGrafico extends Componente{

    @Override
    public double getPrecoCusto() {
        return 180;
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
