package edu.learning.chain;

import edu.learning.model.Email;

public abstract class AbstractEmailHandler {
    
    private AbstractEmailHandler proximo;
    
    public final void setProximo(AbstractEmailHandler proximo){
        this.proximo = proximo;
    }
    
    public final void handleRequest(Email email){
        if(aceitar(email)){
            handle(email);
        }
        else if(this.proximo != null){
            this.proximo.handleRequest(email);
        }
    }
    
    public abstract boolean aceitar(Email email);

    public abstract void handle(Email email);
}
