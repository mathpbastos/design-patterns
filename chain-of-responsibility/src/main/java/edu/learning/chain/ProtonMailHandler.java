package edu.learning.chain;

import edu.learning.model.Email;

public class ProtonMailHandler extends AbstractEmailHandler{

    @Override
    public boolean aceitar(Email email) {
        return email.getSender().toLowerCase().contains("@proton");
    }

    @Override
    public void handle(Email email) {
        System.out.println("PROTON MAIL HANDLER ->> " + email.getSender());
    }
    
}
