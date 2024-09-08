package org.example.Observable.Example4.Observable;

import org.example.Observable.Example4.Observer.Observer;

public interface Observable {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObserver();
}
