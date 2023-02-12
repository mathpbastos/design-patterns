package edu.learning.presenter;

import edu.learning.model.CondicoesClimaticas;
import edu.learning.view.AtualizaCondicoesClimaticasView;
import java.awt.event.ActionEvent;
import java.time.LocalTime;

public class AtualizaCondicoesClimaticasPresenter {
    
    private AtualizaCondicoesClimaticasView view;
    private CondicoesClimaticas condicoesClimaticas;

    public AtualizaCondicoesClimaticasPresenter(
            CondicoesClimaticas condicoesClimaticas) {
        view = new AtualizaCondicoesClimaticasView();
        this.condicoesClimaticas = condicoesClimaticas;
        initButton();
        view.setVisible(true);
    }
    
    private void initButton(){
        view.getBtnSalvar().addActionListener((ActionEvent e) -> {
            salvar();
        }); 
    }
    
    private CondicoesClimaticas obterCampos(){
        String temperatura = view.getTfTemperatura().getText();
        String umidade = view.getTfUmidade().getText();
        
        return new CondicoesClimaticas(
                Double.parseDouble(temperatura),
                Double.parseDouble(umidade),
                LocalTime.now());
    }
    
    private void salvar(){
        CondicoesClimaticas cc = obterCampos();
        
        this.condicoesClimaticas.atualizarMedicoes(
                cc.getTemperatura(), 
                cc.getUmidade(),
                cc.getUltimaMedicao());
        
        this.view.dispose();
    }
}
