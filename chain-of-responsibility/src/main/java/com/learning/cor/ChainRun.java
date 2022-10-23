package com.learning.cor;

import com.learning.cor.chain.Handler;
import com.learning.cor.chain.PasswordVerifierHandler;
import com.learning.cor.chain.RoleCheckHandler;
import com.learning.cor.chain.UserExistsHandler;
import com.learning.cor.model.Server;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChainRun {

    public static void main(String[] args) throws IOException{
        Server server = new Server();
        server.register("aaaa@admin.com", "123");
        server.register("bbb@mail.com", "456");
        
        Handler h = new UserExistsHandler(server);
        Handler h1 = new PasswordVerifierHandler(server);
        Handler h2 = new RoleCheckHandler();
        h.link(h1);
        h1.link(h2);
        
        server.setHandler(h);
        
        boolean success;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        do{
            System.out.println("Enter email: ");
            String email = reader.readLine();
            System.out.println("Enter password: ");
            String password = reader.readLine();
            success = server.login(email, password);
        }while(!success);
    }
    
    
    
}
