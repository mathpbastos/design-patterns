package edu.learning.state;

import edu.learning.model.MaquinaChiclete;

public class ChicleteVendidoState extends StateMaquinaChiclete {

    public ChicleteVendidoState(MaquinaChiclete maquina) {
        super(maquina);
        this.descricao = "Chiclete Vendido";
        this.dispensarChiclete();
    }

    @Override
    public void dispensarChiclete() {
        if (this.maquina.getQtdChicletes() > 0) {
            if (this.maquina.promocao()) {
                this.maquina.dispensarChicletesPromocao();
            } else {
                this.maquina.dispensarChiclete();
            }
            
            if(this.maquina.getQtdChicletes() == 0){
                this.maquina.setEstado(new SemChicleteState(this.maquina));
            }
            else{
                this.maquina.setEstado(new SemMoedaState(this.maquina));
            }
        }
        else{
            this.maquina.setEstado(new SemChicleteState(this.maquina));
        }
    }

}
