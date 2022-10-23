package com.learning.cor.chain;

public abstract class Handler {
    
    private static Handler next;
    
    public static void link(Handler nextHandler){
        next = nextHandler;
    }
    
    public abstract boolean check(String email, String password);
    
    protected boolean checkNext(String email, String password){
        if(next == null)
            return true;
        return next.check(email, password);
    }
}
