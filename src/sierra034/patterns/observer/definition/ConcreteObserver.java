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

    @Override
    public void handleEvent() {
        System.out.println("Handling event ConcreteObserver");
    }
    
}
