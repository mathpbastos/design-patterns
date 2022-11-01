package com.learning.observer.editor;

import com.learning.observer.publisher.EventManager;

import java.io.File;
import java.io.IOException;

public class Editor {
    public EventManager events;
    private File file;

    public Editor(){
        this.events = new EventManager("open", "save");
    }

    public void openFile(String filePath){
        this.file = new File(filePath);
        events.notify("open", file);
    }

    public void saveFile() throws IOException {
        if(this.file != null){
            events.notify("save", file);
        }
        else {
            throw new IOException("Please, open a file first.");
        }
    }
}
