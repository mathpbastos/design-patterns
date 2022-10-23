
package com.learning.cor.chain;

import com.learning.cor.model.Server;

public class UserExistsHandler extends Handler {
    
    private Server server;

    public UserExistsHandler(Server server) {
        this.server = server;
    }

    @Override
    public boolean check(String email, String password) {
        if(!server.hasEmail(email)){
            System.out.println("E-mail not registered.");
            return false;
        }
        return checkNext(email, password);
    }
    
      
    
    
}
