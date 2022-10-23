package com.learning.cor.chain;

public class RoleCheckHandler extends Handler{
    public boolean check(String email, String password){
        if(email.contains("@admin.com")){
            System.out.println("Logged as admin");
            return true;
        }
        System.out.println("Logged as regular user");
        return checkNext(email, password);
    }
}
