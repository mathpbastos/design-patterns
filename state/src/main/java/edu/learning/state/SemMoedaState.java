package edu.learning.state;

import edu.learning.model.MaquinaChiclete;

public class SemMoedaState extends StateMaquinaChiclete{

    public SemMoedaState(MaquinaChiclete maquina) {
        super(maquina);
        this.descricao = "Sem Moeda";
    }
    
    @Override
    public void inserirMoeda() {
        this.maquina.setEstado(new ComMoedaState(this.maquina));
    }
    
}
