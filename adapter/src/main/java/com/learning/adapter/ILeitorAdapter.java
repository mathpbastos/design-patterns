package com.learning.adapter;

import com.learning.adapter.model.Log;
import java.io.IOException;

public interface ILeitorAdapter {
    
    public void record(Log log) throws IOException;
    
}
