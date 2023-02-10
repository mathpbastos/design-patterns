package edu.learning.model;

import edu.learning.pagamento.EstrategiaPagamento;

public class Pedido {
    
    private double custoTotal = 0;
    private boolean fechado = false;
    
    public void processarPedido(EstrategiaPagamento strategy){
        strategy.coletarDetalhesPagamento();
    }

    public double getCustoTotal() {
        return custoTotal;
    }

    public void setCustoTotal(double custoTotal) {
        this.custoTotal = custoTotal;
    }

    public boolean isFechado() {
        return fechado;
    }

    public void setFechado(boolean fechado) {
        this.fechado = fechado;
    }
    
}
