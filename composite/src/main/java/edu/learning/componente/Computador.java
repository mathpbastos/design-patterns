package edu.learning.componente;

public class Computador extends ComponenteComposite {

    @Override
    public double getPrecoCusto() {
        System.out.println("Calculando preço de custo da composição:");
        double preco = 0;
        for(Componente c : this.componentes)
            preco += c.getPrecoCusto();
        
        return preco;
    }

    @Override
    public double getPrecoLucroMinimo() {
        System.out.println("Calculando preco com lucro mínimo da composição:");
        double preco = 0;
        for(Componente c : this.componentes)
            preco += c.getPrecoLucroMinimo();
        return preco;
    }

    @Override
    public double getPrecoLucroMaximo() {
        System.out.println("Calculando preõ com lucro máximo da composição:");
        double preco = 0;
        for(Componente c : componentes)
            preco += c.getPrecoLucroMaximo();
        
        return preco;
    }
    
}
