package edu.learning;

import edu.learning.client.Application;
import edu.learning.factories.GUIFactory;
import edu.learning.factories.WindowsFactory;

public class AppRun {

    public static void main(String[] args) {
        
        GUIFactory factory = new WindowsFactory();
        
        Application app = new Application(factory);
        
    }
}
