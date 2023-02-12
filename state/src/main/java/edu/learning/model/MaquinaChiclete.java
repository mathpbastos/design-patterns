package edu.learning.model;

import edu.learning.state.SemMoedaState;
import edu.learning.state.StateMaquinaChiclete;

public class MaquinaChiclete {
    
    private int qtdChicletes;
    private int qtdMoedas;
    private int contadorPromocao;
    private StateMaquinaChiclete estado;

    public MaquinaChiclete(int qtdChicletes) {
        this.qtdChicletes = qtdChicletes;
        this.qtdMoedas = 0;
        this.contadorPromocao = 0;
        this.estado = new SemMoedaState(this);
    }

    public int getQtdChicletes() {
        return qtdChicletes;
    }

    public int getQtdMoedas() {
        return qtdMoedas;
    }

    public int getFlagPromocao() {
        return contadorPromocao;
    }

    public void setEstado(StateMaquinaChiclete estado) {
        this.estado = estado;
    }

    public StateMaquinaChiclete getEstado() {
        return estado;
    }
    
    public boolean promocao(){
        this.contadorPromocao++;
        if(this.contadorPromocao == 10){
            this.contadorPromocao = 0;
            return true;
        }
        
        return false;
    }
    
    public void dispensarChiclete(){
        this.qtdChicletes--;
    }
    
    public void dispensarChicletesPromocao(){
        this.qtdChicletes -= 2;
    }
    
    public void reabastecer(int quantidade){
        this.qtdChicletes = quantidade;
        this.estado.reabastecer(quantidade);
    }
    
    public void girarManivela(){
        this.estado.girarManivela();
    }
    
    public void inserirMoeda(){
        this.estado.inserirMoeda();
    }
    
    public void tirarMoeda(){
        this.estado.tirarMoeda();
    }
}