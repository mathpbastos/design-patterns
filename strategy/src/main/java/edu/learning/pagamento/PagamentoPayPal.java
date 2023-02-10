package edu.learning.pagamento;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class PagamentoPayPal implements EstrategiaPagamento {

    private static final Map<String, String> DATABASE = new HashMap();
    private final BufferedReader LEITOR
            = new BufferedReader(new InputStreamReader(System.in));
    private String email;
    private String senha;
    private boolean logado;

    static {
        DATABASE.put("user1", "user1@mail.com");
        DATABASE.put("user2", "user2@mail.com");
    }

    @Override
    public void coletarDetalhesPagamento() {
        try {
            while (!logado) {
                System.out.println("E-mail usuário:");
                this.email = LEITOR.readLine();
                System.out.println("Senha usuário:");
                this.senha = LEITOR.readLine();
            }
        } catch (IOException ex) {
            System.out.println("Erro\n" + ex.getMessage());
        }
    }

    @Override
    public boolean pagar(double valor) {
        if (!logado) 
            return false;
        
        System.out.println("Pagando: " + valor + " usando PayPal.");
        return true;
    }

    private boolean verificar() {
        setLogado(email.equals(DATABASE.get(senha)));
        return logado;
    }

    public void setLogado(boolean logado) {
        this.logado = logado;
    }

}
