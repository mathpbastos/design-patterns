package edu.learning.prototype;

public class FiestaPrototype extends CarroPrototype {
    
    protected FiestaPrototype(FiestaPrototype prototype){
        this.valorCompra = prototype.getValorCompra();
    }
    
    public FiestaPrototype(){
        valorCompra = 0.0;
    }
    
    @Override
    public String toString() {
        return "\nModelo: Fiesta\nMontadora: Ford\n" + "Valor: R$" + getValorCompra();
    }
}
