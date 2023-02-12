package edu.learning.command;

import edu.learning.model.Televisao;

public abstract class TelevisaoCommand {
    
    protected Televisao televisao;
    
    protected TelevisaoCommand(Televisao televisao){
        this.televisao = televisao;
    }
    
    public abstract void executar();
    
}
