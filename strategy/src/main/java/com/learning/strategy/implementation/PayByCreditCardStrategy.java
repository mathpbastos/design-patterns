package com.learning.strategy.implementation;

import com.learning.strategy.model.CreditCard;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PayByCreditCardStrategy implements IPayStrategy {
    private final BufferedReader READER = new BufferedReader(
            new InputStreamReader(System.in));
    private CreditCard card;

    private boolean cardIsPresent(){
        return card != null;
    }
    
    @Override
    public boolean pay(int paymentAmount) {
        if(cardIsPresent()){
            System.out.println("Paying " + paymentAmount + " using"
                    + " credit card");
            card.setAmount(card.getAmount() - paymentAmount);
            return true;
        }
        return false;
    }

    @Override
    public void collectPaymentDetails() {
        try{
            System.out.println("Enter card number:");
            String number = READER.readLine();
            System.out.println("Enter card expiration date:");
            String date = READER.readLine();
            System.out.println("Enter CVV:");
            String cvv = READER.readLine();
            card = new CreditCard(number, date, cvv);
            
            // code to verify if it is a valid card
        } catch (IOException ex){
            System.out.println("Erro" + ex.getMessage());
        }
    }
}
