package edu.learning.model;

import edu.learning.command.TelevisaoCommand;

public class ControleRemoto {
    
    private TelevisaoCommand command;

    public ControleRemoto(TelevisaoCommand command) {
        this.command = command;
    }
    
    public void pressionarBotaoPower(){
        this.command.executar();
    }

    public void setCommand(TelevisaoCommand command) {
        this.command = command;
    }
    
}