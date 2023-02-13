package edu.learning;

import edu.learning.componente.AceleradorGrafico;
import edu.learning.componente.CPU;
import edu.learning.componente.Computador;
import edu.learning.componente.HardDisk;
import edu.learning.componente.Memoria;
import edu.learning.componente.PlacaDeVideo;
import edu.learning.componente.PlacaMae;
import edu.learning.componente.ProcessadorGrafico;

public class AppRun {

    public static void main(String[] args) {
        
        Computador pc = new Computador();
        PlacaMae placaMae = new PlacaMae();
        CPU cpu = new CPU();
        PlacaDeVideo placaDeVideo = new PlacaDeVideo();
        AceleradorGrafico aceleradorGrafico = new AceleradorGrafico();
        ProcessadorGrafico processadorGrafico = new ProcessadorGrafico();
        Memoria memoria = new Memoria();
        HardDisk hd = new HardDisk();
        
        pc.add(placaMae);  
        placaMae.add(cpu);
        placaMae.add(hd);
        placaMae.add(memoria);
        placaDeVideo.add(aceleradorGrafico);
        aceleradorGrafico.add(processadorGrafico);
        placaMae.add(placaDeVideo);
        
        System.out.println("Preço de custo: " + pc.getPrecoCusto());
        System.out.println("Lucro máximo: " + pc.getPrecoLucroMaximo());
        System.out.println("Lucro mínimo: " + pc.getPrecoLucroMinimo());
        
    }
}
