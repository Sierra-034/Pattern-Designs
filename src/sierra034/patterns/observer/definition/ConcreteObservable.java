/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sierra034.patterns.observer.definition;

import java.util.ArrayList;

/**
 *
 * @author Samuel Gomez
 */
public class ConcreteObservable implements Observable {

    private ArrayList observers;
    
    public ConcreteObservable() {
        observers = new ArrayList();
    }
    
    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Object element : observers) {
            Observer observer = (Observer) element;
            observer.handleEvent();
        }
    }
    
}
