package edu.learning.logs.service;

import edu.learning.logs.ILogAdapter;
import edu.learning.model.Log;
import java.io.IOException;

public class LogAdapterService {
    
    private ILogAdapter logAdapter;
    
    public LogAdapterService(ILogAdapter logAdapter){
        this.logAdapter = logAdapter;
    }

    public void setLogAdapter(ILogAdapter logAdapter) {
        this.logAdapter = logAdapter;
    }
    
    public void gravarLog(Log log) throws IOException{
        this.logAdapter.escreverLog(log);
    }
    
    public void lerLogs() throws IOException{
        this.logAdapter.lerLogs();
    }
}
