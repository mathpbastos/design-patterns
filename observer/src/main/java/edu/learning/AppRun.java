package edu.learning;

import edu.learning.model.CondicoesClimaticas;
import edu.learning.presenter.TelaTemperaturaPresenter;
import java.time.LocalTime;

public class AppRun {

    public static void main(String[] args) {
        new TelaTemperaturaPresenter(new CondicoesClimaticas(0,
                0,
                LocalTime.now()));
    }
}
