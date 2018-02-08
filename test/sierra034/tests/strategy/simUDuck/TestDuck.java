/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sierra034.tests.strategy.simUDuck;

import org.junit.Test;
import static org.junit.Assert.*;
import sierra034.strategy.simUDuck.Duck;

/**
 *
 * @author Samuel Gomez
 */
public class TestDuck {
    
    protected Duck duckToTest;
    
    @Test
    public void testPerformQuack(){
        duckToTest.performQuack();
    }
    
    @Test
    public void testSwim(){
        duckToTest.swim();
    }   
    
    @Test
    public void testPerformFly(){
        duckToTest.performFly();
    }   
    
    @Test
    public void testDisplay(){
        duckToTest.display();
    }
    
}
