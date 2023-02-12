package edu.learning.state;

import edu.learning.model.MaquinaChiclete;

public class SemChicleteState extends StateMaquinaChiclete{

    public SemChicleteState(MaquinaChiclete maquina) {
        super(maquina);
        this.descricao = "Sem Chiclete";
    }

    @Override
    public void reabastecer(int quantidade) {
        this.maquina.reabastecer(quantidade);
        this.maquina.setEstado(new SemMoedaState(this.maquina));
    }
    
    
    
}
