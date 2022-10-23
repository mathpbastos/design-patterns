package com.learning.cor.model;

import com.learning.cor.chain.Handler;
import java.util.HashMap;
import java.util.Map;


public class Server {
    
    private Map<String, String> accounts = new HashMap<>();
    Handler handler;
    
    public boolean login(String email, String password){
        if(handler.check(email, password)){
            System.out.println("Logged in.");
            return true;
        }
        return false;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
    
    public void register(String email, String password){
        accounts.put(email, password);
    }
    
    public boolean hasEmail(String email){
        return accounts.containsKey(email);
    }    
    
    public boolean isValidPassword(String email, String password){
        return accounts.get(email).equals(password);
    }
    
}
