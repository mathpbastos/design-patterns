package edu.learning;

import edu.learning.logs.CSVLog;
import edu.learning.logs.JSONLog;
import edu.learning.logs.service.LogAdapterService;
import edu.learning.model.Log;
import edu.learning.model.Usuario;
import java.io.IOException;
import java.time.LocalDateTime;

public class AppRun {

    public static void main(String[] args) throws IOException {
        String myFile =  "my_file";
        
        Usuario u = new Usuario("Joana", "Machado");

        Log l = new Log("ERRO",
                "SUCESSIVAS FALHAS DE LOGIN",
                u,
                LocalDateTime.now());

        LogAdapterService service = new LogAdapterService(new CSVLog(myFile));
        service.setLogAdapter(new JSONLog(myFile));
        
        service.gravarLog(l);
        service.lerLogs();
    }
}
