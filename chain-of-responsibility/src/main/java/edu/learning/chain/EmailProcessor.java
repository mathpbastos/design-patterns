package edu.learning.chain;

import edu.learning.model.Email;

public class EmailProcessor {
    
    private AbstractEmailHandler first;
    private AbstractEmailHandler successor;

    public EmailProcessor() {
    }
    
    public void addEmailHandler(AbstractEmailHandler handler){
        if(this.first == null){
            this.first = handler;
        }
        else{
            this.successor.setProximo(handler);
        }
        this.successor = handler;
    }
    
    public void handleResquest(Email email){
        first.handleRequest(email);
    }
    
}
