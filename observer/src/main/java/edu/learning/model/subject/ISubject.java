package edu.learning.model.subject;

import edu.learning.model.observer.IObserver;

public interface ISubject {
    
    public void addObserver(IObserver o);
    
    public void removeObserver(IObserver o);
    
    public void notifyObservers();
    
}
