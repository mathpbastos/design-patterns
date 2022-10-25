package com.learning.singleton;

public class SingletonRun {
    public static void main(String[] args) {
        
        Singleton s = Singleton.getInstance("Instancia 1");
        System.out.println(s.getValue());
        Singleton s1 = Singleton.getInstance("Instância 2");
        System.out.println(s1.getValue());
        Singleton s2 = Singleton.getInstance("Instância 2");
        System.out.println(s2.getValue());
    }
}
