package edu.learning.model;

public class CartaoCredito {
    
    private String numero;
    private String validade;
    private String cvv;
    private double limite;

    public CartaoCredito(String numero, String validade, String cvv) {
        this.limite = 1000;
        this.numero = numero;
        this.validade = validade;
        this.cvv = cvv;
    }

    public String getNumero() {
        return numero;
    }

    public String getValidade() {
        return validade;
    }

    public String getCvv() {
        return cvv;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }
    
}
