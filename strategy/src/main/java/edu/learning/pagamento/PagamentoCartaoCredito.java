package edu.learning.pagamento;

import edu.learning.model.CartaoCredito;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PagamentoCartaoCredito implements EstrategiaPagamento{
    
    private final BufferedReader LEITOR =
            new BufferedReader(new InputStreamReader(System.in));
    private CartaoCredito cartao;

    @Override
    public boolean pagar(double valor) {
        if(!cartaoAdicionado())
            return false;
        
        System.out.println("Pagando " + valor + 
                    " usando cartão de crédito");
        this.cartao.setLimite(this.cartao.getLimite() - valor);
        return true;
    }

    @Override
    public void coletarDetalhesPagamento() {
        try {
            System.out.println("Informe o número do cartão:");
            String numero = LEITOR.readLine();
            System.out.println("Informe a data de validade do cartão:");
            String validade = LEITOR.readLine();
            System.out.println("Informe o CVV:");
            String cvv = LEITOR.readLine();
            
            this.cartao = new CartaoCredito(numero, validade, cvv);
            
        } catch (IOException ex) {
            System.out.println("ERRO " + ex.getMessage());
        }
    }
    
    private boolean cartaoAdicionado(){
        return this.cartao != null;
    }
    
}
