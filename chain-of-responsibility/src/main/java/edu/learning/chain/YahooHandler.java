package edu.learning.chain;

import edu.learning.model.Email;

public class YahooHandler extends AbstractEmailHandler{

    @Override
    public boolean aceitar(Email email) {
        return email.getSender().toLowerCase().contains("@yahoo");
    }

    @Override
    public void handle(Email email) {
        System.out.println("YAHOO HANDLER ->> " + email.getSender());
    }
    
}
