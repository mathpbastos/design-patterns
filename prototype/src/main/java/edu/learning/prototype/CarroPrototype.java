package edu.learning.prototype;

public abstract class CarroPrototype implements Cloneable{
    
    protected double valorCompra;
    
    public final double getValorCompra(){
        return this.valorCompra;
    }

    @Override
    public CarroPrototype clone() throws CloneNotSupportedException {
        Object clone = null;
        clone = super.clone();
        
        return (CarroPrototype)clone;
    }
    
    public void setValorCompra(double valorCompra){
        this.valorCompra = valorCompra;
    }
    
}
