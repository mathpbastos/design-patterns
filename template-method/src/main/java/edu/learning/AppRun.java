package edu.learning;

import edu.learning.template.BebidaQuente;
import edu.learning.template.Cafe;
import edu.learning.template.Cha;

public class AppRun {

    public static void main(String[] args) {
        BebidaQuente bq = new Cafe();
        
        bq = new Cha();
        
        bq.preparar();
    }
}
