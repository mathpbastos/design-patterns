package com.learning.strategy.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class PayByPaypalStrategy implements IPayStrategy{

    private static final Map<String, String> DATABASE = new HashMap<>();
    private final BufferedReader READER = new BufferedReader(
            new InputStreamReader(System.in));
    private String email;
    private String password;
    private boolean signedIn;
    
    static{
        DATABASE.put("joao123", "joao123@mail.com");
        DATABASE.put("maria456", "maria456@mail.com");
    }
    
    private boolean verify(){
        setSignedIn(email.equals(DATABASE.get(password)));
        return signedIn;
    }
    
    @Override
    public boolean pay(int paymentAmount) {
        if(signedIn){
            System.out.println("Paying " + paymentAmount + " using Paypal.");
            return true;
        }
        return false;
    }

    @Override
    public void collectPaymentDetails() {        
        try {
                while(!signedIn){
                System.out.println("Enter email:");
                email = READER.readLine();
                System.out.println("Enter password:");
                password = READER.readLine();
                if(verify()){
                    System.out.println("Confirmed.");
                }
                else{
                    System.out.println("Wrong pass or email");
                }
            }
        } catch (IOException ex) {
            System.out.println("ERRO -> " + ex.getMessage());
        }
    }

    public void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }
    
}
