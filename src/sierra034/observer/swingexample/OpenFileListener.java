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
public class OpenFileListener implements Listener {

    @Override
    public void simpleActionPerformed() {
        System.out.println("Opening a new file");
    }

    @Override
    public void registerTo(Subject s) {
        s.addObserver(this);
    }
    
}
