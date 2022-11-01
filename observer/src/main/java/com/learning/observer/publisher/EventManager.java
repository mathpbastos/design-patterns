package com.learning.observer.publisher;

import com.learning.observer.listener.IEventListener;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {
    
    private Map<String, List<IEventListener>> listeners = new HashMap();
    
    public EventManager(String... operations){
        for(String operation : operations)
            listeners.put(operation, new ArrayList());
    }
    
    public void subscribe(String operation, IEventListener eventListener){
        List<IEventListener> subscribers = listeners.get(operation);
        subscribers.add(eventListener);
    }
    
    public void unsubscribe(String operation, IEventListener eventListener){
        List<IEventListener> subscribers = listeners.get(operation);
        subscribers.remove(eventListener);
    }
    
    public void notify(String operation, File file){
        List<IEventListener> subscribers = listeners.get(operation);
        for(IEventListener listener : subscribers)
            listener.update(operation, file);
    }
}
