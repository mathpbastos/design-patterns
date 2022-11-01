package com.learning.observer.listener;

import java.io.File;

public class EmailNotificationListener implements IEventListener{
    private String email;
    
    public EmailNotificationListener(String email){
        this.email = email;
    }

    @Override
    public void update(String operation, File file) {
        System.out.println("Email to: " + this.email + "\n" +
                "Someone has performed " + operation);
    }
}
