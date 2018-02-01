/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sierra034.patterns.observer.definition;

/**
 *
 * @author Samuel Gomez
 */
public class ConcreteObserver implements Observer {
    
    public ConcreteObserver() { }
    
    public ConcreteObserver(Observable subject) {
        subject.addObserver(this);
    }

    @Override
    public void handleEvent() {
        System.out.print("Handling event ConcreteObserver");
    }

    @Override
    public void registerTo(Observable subject) {
        subject.addObserver(this);
    }
    
}
