package edu.learning.command;

import edu.learning.model.Televisao;

public class LigarTelevisaoCommand extends TelevisaoCommand{

    private Televisao televisao;

    public LigarTelevisaoCommand(Televisao televisao) {
        super(televisao);
    }
    
    @Override
    public void executar() {
        this.televisao.ligar();
    }
    
}
