package edu.learning.componente;

public class AceleradorGrafico extends ComponenteComposite{

    @Override
    public double getPrecoCusto() {
        System.out.println("Calculando preco de custo: [Acelerador Gráfico]");
        double preco = 100;
        for (Componente c : componentes)
            preco += c.getPrecoCusto();
        return preco;
    }

    @Override
    public double getPrecoLucroMinimo() {
        System.out.println("Calculando Preco com lucro mínimo da composição: [Acelerador Gráfico]");
        double preco = 150;
        for (Componente c : componentes) {
            preco += c.getPrecoLucroMinimo();
        }
        return preco;
    }

    @Override
    public double getPrecoLucroMaximo() {
        System.out.println("Calculando Preco com lucro maximo da composição: [Acelerador Gráfico]");
        double preco = 200;
        for (Componente c : componentes) {
            preco += c.getPrecoLucroMaximo();
        }
        return preco;
    }
    
    
}
