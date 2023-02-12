package edu.learning.state;

import edu.learning.model.MaquinaChiclete;

public class ComMoedaState extends StateMaquinaChiclete{

    public ComMoedaState(MaquinaChiclete maquina) {
        super(maquina);
        this.descricao = "Com Moeda";
    }

    @Override
    public void girarManivela() {
        this.maquina.setEstado(new ChicleteVendidoState(this.maquina));
    }

    @Override
    public void tirarMoeda() {
        this.maquina.setEstado(new SemMoedaState(this.maquina));
    }
    
}
