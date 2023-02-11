package edu.learning.chain;

import edu.learning.model.Email;

public class BolHandler extends AbstractEmailHandler{
    
    public BolHandler(){}

    @Override
    public boolean aceitar(Email email) {
        return email.getSender().toLowerCase().contains("@bol");
    }

    @Override
    public void handle(Email email) {
        System.out.println("BOL HANDLER ->> " + email.getSender());
    }
    
}
