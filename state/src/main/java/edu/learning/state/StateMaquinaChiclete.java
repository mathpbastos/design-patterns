package edu.learning.state;

import edu.learning.model.MaquinaChiclete;

public abstract class StateMaquinaChiclete {
    
    protected MaquinaChiclete maquina;
    protected String descricao;
    
    protected StateMaquinaChiclete(MaquinaChiclete maquina){
        this.maquina = maquina;
    }
    
    public void inserirMoeda(){
        throw new UnsupportedOperationException("Não é possível ir para "
                + "o estado especificado a partir do estado atual.");
    }
    
    public void tirarMoeda(){
        throw new UnsupportedOperationException("Não é possível ir para "
                + "o estado especificado a partir do estado atual.");
    }
    
    public void girarManivela(){
        throw new UnsupportedOperationException("Não é possível ir para "
                + "o estado especificado a partir do estado atual.");
    }
    
    public void dispensarChiclete(){
        throw new UnsupportedOperationException("Não é possível ir para "
                + "o estado especificado a partir do estado atual.");
    }
    
    public void dispensarMoeda(){
        throw new UnsupportedOperationException("Não é possível ir para "
                + "o estado especificado a partir do estado atual.");
    }
    
    public void reabastecer(int quantidade){
        throw new UnsupportedOperationException("Não é possível ir para "
                + "o estado especificado a partir do estado atual.");
    }

    public final String getDescricao() {
        return descricao;
    }
    
}
