package com.learning.adapter.run;

import com.learning.adapter.CSVWriterAdapter;
import com.learning.adapter.ILeitorAdapter;
import com.learning.adapter.model.Log;
import java.io.IOException;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;

public class AdapterRun {
    public static void main(String[] args) {
        
        ILeitorAdapter adapter = new CSVWriterAdapter("/home/b1n/Downloads/log.txt");
        
        Log log = new Log("ERRO", "ERRO FATAL VERIFIQUE", "JONAS", LocalDateTime.now());
        
        try {
            adapter.record(log);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Arquivo inválido", 
                    "Erro", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }
}
