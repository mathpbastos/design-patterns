package edu.learning.mediator;

public abstract class IUser {
    
    protected IChatMediator mediator;
    protected String name;
    
    public IUser(IChatMediator mediator, String name){
        this.mediator = mediator;
        this.name = name;
    }
    
    public abstract void send(String msg);
    
    public abstract void receive(String msg);
    
}
