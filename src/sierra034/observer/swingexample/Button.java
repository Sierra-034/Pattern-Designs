/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sierra034.observer.swingexample;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Samuel Gómez
 */
public class Button implements Subject {
    
    private List<Listener> listeners = new ArrayList<Listener>();

    @Override
    public void addObserver(Listener al) {
        listeners.add(al);
    }

    @Override
    public void removeObserver(Listener al) {
        listeners.remove(al);
    }

    @Override
    public void notifyObservers() {
        for(Listener listener : listeners)
            listener.simpleActionPerformed();
    }
    
}
