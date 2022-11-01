package com.learning.observer.listener;

import java.io.File;

public class LogOpenListener implements IEventListener{
    private File log;

    public LogOpenListener(String fileName) {
        this.log = new File(fileName);
    }

    @Override
    public void update(String operation, File file) {
        System.out.println("Save to log " + log + "\n" +
                "Someone has performed " + operation);
    }
}
