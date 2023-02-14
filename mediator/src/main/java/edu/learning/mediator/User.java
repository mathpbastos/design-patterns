package edu.learning.mediator;

public class User extends IUser{

    public User(IChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String msg) {
        System.out.println("Sending...");
        System.out.println(this.name + ": " + msg);
        mediator.sendMessage(msg, this);
    }

    @Override
    public void receive(String msg) {
        System.out.println("Receiving...");
        System.out.println(this.name + ": " + msg);
    }
    
}
