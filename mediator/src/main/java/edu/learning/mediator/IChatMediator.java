package edu.learning.mediator;

public interface IChatMediator {
    
    public void sendMessage(String msg, IUser user);
    
    void addUser(IUser user);
    
}
