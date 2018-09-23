/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sierra034.test.observer;

import sierra034.observer.swingexample.Button;
import sierra034.observer.swingexample.Listener;
import sierra034.observer.swingexample.MenuItem;
import sierra034.observer.swingexample.NewFileListener;
import sierra034.observer.swingexample.OpenFileListener;

/**
 *
 * @author Samuel Gómez
 */
public class ObserverDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Button newFileButton = new Button();
        MenuItem newFileMenuItem = new MenuItem();
        
        Button openFileButton = new Button();    
        MenuItem openFileMenuItem = new MenuItem();
        
        Listener newFileListener = new NewFileListener();
        newFileButton.addObserver(newFileListener);
        newFileMenuItem.addObserver(newFileListener);
        
        Listener openFileListener = new OpenFileListener();
        openFileButton.addObserver(openFileListener);
        openFileMenuItem.addObserver(openFileListener);
        
        newFileButton.notifyObservers();
        newFileMenuItem.notifyObservers();
        
        openFileButton.notifyObservers();
        openFileMenuItem.notifyObservers();
    }
    
}
