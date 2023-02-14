package edu.learning;

import edu.learning.proxy.Image;
import edu.learning.proxy.ProxyImage;

public class AppRun {

    public static void main(String[] args) {
        
        Image proxy = new ProxyImage("teste.jpg");
        
        proxy.display();
    }
}
