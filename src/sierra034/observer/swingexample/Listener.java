/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sierra034.observer.swingexample;

/**
 * This interface specifies the observer
 *
 * @author Samuel Gómez
 */
public interface Listener {
    void simpleActionPerformed();
    void registerTo(Subject s);
}
