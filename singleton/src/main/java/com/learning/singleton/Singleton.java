package com.learning.singleton;

public class Singleton {
    
    private static Singleton singleton;
    private String value;
    
    private Singleton(String value){
        this.value = value;
    }
    
    public String getValue(){
        return value;
    }
    
    public static Singleton getInstance(String value){
        if(singleton == null)
            singleton = new Singleton(value);
        return singleton;
    }
    
}
