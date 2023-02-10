package edu.learning.pagamento;

public interface EstrategiaPagamento {
    
    public boolean pagar(double valor);
    
    public void coletarDetalhesPagamento();
    
}
