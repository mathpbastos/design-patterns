package edu.learning.logs;

import edu.learning.model.Log;
import java.io.File;
import java.io.IOException;
import java.time.format.DateTimeFormatter;

public abstract class ILogAdapter {
    
    protected File arquivo; 
    protected final DateTimeFormatter formatador
            = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:MM");
    
    public ILogAdapter(String nomeArquivo){
        this.arquivo = new File(nomeArquivo);
    }
    
    public abstract void escreverLog(Log log) throws IOException;
    
    public abstract void lerLogs() throws IOException;
    
}
