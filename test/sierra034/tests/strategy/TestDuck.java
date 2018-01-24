/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sierra034.tests.strategy;

import org.junit.Test;
import static org.junit.Assert.*;
import sierra034.patterns.strategy.Duck;
import sierra034.patterns.strategy.FlyBehavior;
import sierra034.patterns.strategy.QuackBehavior;

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
