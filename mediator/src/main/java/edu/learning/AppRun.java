package edu.learning;

import edu.learning.mediator.ChatMediator;
import edu.learning.mediator.IChatMediator;
import edu.learning.mediator.IUser;
import edu.learning.mediator.User;

public class AppRun {

    public static void main(String[] args) {
        IChatMediator mediator = new ChatMediator();
        
        IUser u1 = new User(mediator, "Sônia");
        IUser u2 = new User(mediator, "Joana");
        IUser u3 = new User(mediator, "Guilherme");
        IUser u4 = new User(mediator, "Bruno");
        IUser u5 = new User(mediator, "Jonas");
        IUser u6 = new User(mediator, "Raphaella");
        
        mediator.addUser(u2);
        mediator.addUser(u3);
        mediator.addUser(u4);
        mediator.addUser(u5);
        mediator.addUser(u6);
        
        u1.send("Hello fellas.");
    }
}
