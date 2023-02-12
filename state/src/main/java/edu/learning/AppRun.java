package edu.learning;

import edu.learning.model.MaquinaChiclete;

public class AppRun {

    public static void main(String[] args) {
        
        MaquinaChiclete maquinaChiclete = new MaquinaChiclete(10);
        
        System.out.println(maquinaChiclete.getEstado().getDescricao());
        maquinaChiclete.inserirMoeda();
        System.out.println(maquinaChiclete.getEstado().getDescricao());
        maquinaChiclete.girarManivela();
        System.out.println(maquinaChiclete.getEstado().getDescricao());
        System.out.println("Flag promocao: " + maquinaChiclete.getFlagPromocao());
        System.out.println("Qtd Chicletes: " + maquinaChiclete.getQtdChicletes());
        System.out.println(maquinaChiclete.getEstado().getDescricao());
        
    }
}
