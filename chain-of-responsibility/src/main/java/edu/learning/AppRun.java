package edu.learning;

import edu.learning.chain.BolHandler;
import edu.learning.chain.EmailProcessor;
import edu.learning.chain.GmailHandler;
import edu.learning.chain.HotmailHandler;
import edu.learning.chain.ProtonMailHandler;
import edu.learning.chain.YahooHandler;
import edu.learning.model.Email;

public class AppRun {

    public static void main(String[] args) {
        EmailProcessor emailProcessor = new EmailProcessor();
        System.out.println("------------------------");
        emailProcessor.addEmailHandler(new BolHandler());
        System.out.println("------------------------");
        emailProcessor.addEmailHandler(new GmailHandler());
        System.out.println("------------------------");
        emailProcessor.addEmailHandler(new HotmailHandler());
        System.out.println("------------------------");
        //emailProcessor.addEmailHandler(new ProtonMailHandler());
        //emailProcessor.addEmailHandler(new YahooHandler());
        
        Email email = new Email("mail@PRoToN.com.br");
        
        emailProcessor.handleResquest(email);
        
    }
}
