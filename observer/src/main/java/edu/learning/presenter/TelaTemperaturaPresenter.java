package edu.learning.presenter;

import edu.learning.model.CondicoesClimaticas;
import edu.learning.model.observer.IObserver;
import edu.learning.view.TelaCondicoesClimaticasView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.format.DateTimeFormatter;

public class TelaTemperaturaPresenter implements IObserver{
    
    private TelaCondicoesClimaticasView view;
    private CondicoesClimaticas condicoesClimaticas;
    private final DateTimeFormatter formatador = 
            DateTimeFormatter.ofPattern("HH:mm:ss");
    
    public TelaTemperaturaPresenter(CondicoesClimaticas condicoesClimaticas){
        this.view = new TelaCondicoesClimaticasView();
        this.condicoesClimaticas = condicoesClimaticas;
        this.condicoesClimaticas.addObserver(this);
        initButtons();
        atualizarTela();
        view.setVisible(true);
    }
    
    private void initButtons(){
        view.getBtnAtualizar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirTelaAtualizacao();
            }
        });
    }
    
    
    private void atualizarTela(){
        view.getLblTemperatura()
                .setText(Double.toString(condicoesClimaticas.getTemperatura()) 
                        + " ºC");
        view.getLblUmidade()
                .setText(Double.toString(condicoesClimaticas.getUmidade()));
        view.getLblHoraMedicao()
                .setText(condicoesClimaticas
                        .getUltimaMedicao().format(formatador));
    }
    
    private void abrirTelaAtualizacao(){
        new AtualizaCondicoesClimaticasPresenter(this.condicoesClimaticas);
    }

    @Override
    public void update() {
        atualizarTela();
    }
    
}
