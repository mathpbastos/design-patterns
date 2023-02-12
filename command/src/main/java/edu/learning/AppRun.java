package edu.learning;

import edu.learning.command.DesligarTelevisaoCommand;
import edu.learning.command.LigarTelevisaoCommand;
import edu.learning.model.ControleRemoto;
import edu.learning.model.Televisao;

public class AppRun {

    public static void main(String[] args) {
        Televisao tv = new Televisao();
        
        ControleRemoto controle = new ControleRemoto(
                new LigarTelevisaoCommand(tv));
        
        controle.pressionarBotaoPower();
        
        controle.setCommand(new DesligarTelevisaoCommand(tv));
        
        controle.pressionarBotaoPower();
        
    }
}
