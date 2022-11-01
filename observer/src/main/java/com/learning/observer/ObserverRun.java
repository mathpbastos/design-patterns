package com.learning.observer;

import com.learning.observer.editor.Editor;
import com.learning.observer.listener.EmailNotificationListener;
import com.learning.observer.listener.LogOpenListener;

import java.io.IOException;

public class ObserverRun {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("/home/Documents/test.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@mailexample.com"));

        editor.openFile("test.txt");
        try {
            editor.saveFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
