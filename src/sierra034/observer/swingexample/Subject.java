/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sierra034.observer.swingexample;

/**
 *
 * @author Samuel Gómez
 */
public interface Subject {
    void addObserver(Listener al);
    void removeObserver(Listener al);
    void notifyObservers();
}
