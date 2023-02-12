package edu.learning.command;

import edu.learning.model.Televisao;

public class DesligarTelevisaoCommand extends TelevisaoCommand{

    public DesligarTelevisaoCommand(Televisao televisao) {
        super(televisao);
    }

    @Override
    public void executar() {
        this.televisao.desligar();
    }
    
}
