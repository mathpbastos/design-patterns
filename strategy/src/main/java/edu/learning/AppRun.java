package edu.learning;

import edu.learning.model.Pedido;
import edu.learning.pagamento.EstrategiaPagamento;
import edu.learning.pagamento.PagamentoCartaoCredito;
import edu.learning.pagamento.PagamentoPayPal;
import java.util.Scanner;

public class AppRun {

    public static void main(String[] args) {
        // Lógica dos produtos.
        EstrategiaPagamento strategy = null;
        Pedido pedido = new Pedido();
        
        if(strategy == null){
            System.out.println("Informe a forma de pagamento:\n"
                    + "1 - PayPal\n"
                    + "2 - Cartão de Crédito");
            System.out.println("Opção: ");
            int opt = new Scanner(System.in).nextInt();
            
            switch(opt){
                case 1:
                    strategy = new PagamentoPayPal();
                    break;
                case 2:
                    strategy = new PagamentoCartaoCredito();
                    break;
            }
            pedido.processarPedido(strategy);
        }
    }
}
