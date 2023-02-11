package edu.learning.chain;

import edu.learning.model.Email;

public class HotmailHandler extends AbstractEmailHandler {

    @Override
    public boolean aceitar(Email email) {
        return email.getSender().toLowerCase().contains("@hotmail");
    }

    @Override
    public void handle(Email email) {
        System.out.println("Hotmail Handler ->> " + email.getSender());
    }

}
