package com.learning.cor.chain;

import com.learning.cor.model.Server;

public class PasswordVerifierHandler extends Handler{
    
    private Server server;
    
    public PasswordVerifierHandler(Server server){
        this.server = server;
    }

    @Override
    public boolean check(String email, String password) {
        if(!server.isValidPassword(email, password)){
            System.out.println("Wrong Password.");
            return false;
        }
        return checkNext(email, password);    
    }
}
