package edu.learning.chain;

import edu.learning.model.Email;


public class GmailHandler extends AbstractEmailHandler{

    public GmailHandler() {
    }

    @Override
    public boolean aceitar(Email email) {
        return email.getSender().toLowerCase().contains("@gmail");
    }

    @Override
    public void handle(Email email) {
        System.out.println("Gmail handler ->> " + email.getSender());
    }
    
}
