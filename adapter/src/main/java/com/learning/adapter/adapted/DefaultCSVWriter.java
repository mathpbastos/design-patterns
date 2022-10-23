package com.learning.adapter.adapted;

import com.learning.adapter.model.Log;
import com.opencsv.CSVWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DefaultCSVWriter {
    
    private static File file;
    
    public DefaultCSVWriter(String filePath){
        if(!filePath.toLowerCase().endsWith(".csv")){
            throw new RuntimeException("Esta classe deve ser"
                    + "usada apenas para gravação de logs em CSV.");
        }
        file = new File(filePath);
    }
    
    public static void createCSV(Log log) throws IOException{
        
        FileWriter output = new FileWriter(file);
        
        CSVWriter csvWriter = new CSVWriter(output);
        
        String[] data = {log.getType(), log.getInfo(), log.getUser(),
                log.getTimestamp().toString()};
        
        csvWriter.writeNext(data);
        
        csvWriter.close();
    }
}
