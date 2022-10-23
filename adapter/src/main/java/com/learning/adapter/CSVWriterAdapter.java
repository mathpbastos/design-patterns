package com.learning.adapter;

import com.learning.adapter.adapted.DefaultCSVWriter;
import com.learning.adapter.model.Log;
import java.io.IOException;

public class CSVWriterAdapter implements ILeitorAdapter{
    
    private final DefaultCSVWriter csv;
    
    public CSVWriterAdapter(String filePath){
        csv = new DefaultCSVWriter(filePath);
    }

    @Override
    public void record(Log log) throws IOException {
        csv.createCSV(log);
    }       
}
