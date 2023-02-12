package edu.learning.model;

import edu.learning.model.observer.IObserver;
import edu.learning.model.subject.ISubject;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class CondicoesClimaticas implements ISubject{
    
    private double temperatura;
    private double umidade;
    private LocalTime ultimaMedicao;
    private List<IObserver> observers;

    public CondicoesClimaticas(double temperatura, double umidade, LocalTime ultimaMedicao) {
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.ultimaMedicao = ultimaMedicao;
        this.observers = new ArrayList<IObserver>();
    }

    public double getTemperatura() {
        return temperatura;
    }

    public double getUmidade() {
        return umidade;
    }

    public LocalTime getUltimaMedicao() {
        return ultimaMedicao;
    }

    public void atualizarMedicoes(double temperatura, 
            double umidade, LocalTime hora){
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.ultimaMedicao = hora;
        
        notifyObservers();
    }

    @Override
    public void addObserver(IObserver o) {
        this.observers.add(o);
    }

    @Override
    public void removeObserver(IObserver o) {
        this.observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(IObserver observer : observers){
            observer.update();
        }
    }
    
}
