/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sierra034.test.definition;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import sierra034.observer.definition.ConcreteObservable;
import sierra034.observer.definition.ConcreteObserver;
import sierra034.observer.definition.Observable;
import sierra034.observer.definition.Observer;

/**
 *
 * @author Samuel Gomez
 */
public class TestObservers {
    
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final String CONCRETE_OBSERVER_MESSAGE = "Handling event ConcreteObserver";
    private final Observable concreteObservable;
    
    public TestObservers() { 
        concreteObservable = new ConcreteObservable();
    }
    
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }  
    
    @After
    public void retoreStreams() {
        System.setOut(System.out);
        System.setErr(System.err);
    }
    
    @Test
    public void testNotify() {
        concreteObservable.addObserver(new ConcreteObserver());
        concreteObservable.notifyObservers();
        
        String actual = outContent.toString();
        String expected = CONCRETE_OBSERVER_MESSAGE;
        assertEquals(expected, actual);
    }
    
    @Test
    public void testRegisterTo() {
        Observer observer = new ConcreteObserver();
        observer.registerTo(concreteObservable);
        concreteObservable.notifyObservers();
        
        String actual = outContent.toString();
        String expected = CONCRETE_OBSERVER_MESSAGE;
        assertEquals(expected, actual);                
    }
    
    @Test
    public void testConstructor() {
        Observer observer = new ConcreteObserver(concreteObservable);
        concreteObservable.notifyObservers();
        
        String actual = outContent.toString();
        String expected = CONCRETE_OBSERVER_MESSAGE;
        assertEquals(expected, actual);
    }
}
