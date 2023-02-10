package edu.learning.model;

import java.time.LocalDateTime;

public class Log {
    
    private String tipo;
    private String informacao;
    private Usuario usuario;
    private LocalDateTime timestamp;

    public Log(String tipo, String informacao, Usuario usuario, LocalDateTime timestamp) {
        this.tipo = tipo;
        this.informacao = informacao;
        this.usuario = usuario;
        this.timestamp = timestamp;
    }

    public String getTipo() {
        return tipo;
    }

    public String getInformacao() {
        return informacao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

}
