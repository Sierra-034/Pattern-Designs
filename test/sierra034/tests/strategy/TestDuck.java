/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sierra034.tests.strategy;

import org.junit.Test;
import static org.junit.Assert.*;
import sierra034.patterns.strategy.Duck;

/**
 *
 * @author Samuel Gomez
 */
public class TestDuck {
    
    protected Duck duckToTest;
    
    @Test
    public void testQuack(){
        this.duckToTest.quack();
    }
    
    @Test
    public void testSwim(){
        this.duckToTest.swim();
    }   
    
    @Test
    public void testFly(){
        this.duckToTest.fly();
    }   
    
    @Test
    public void testDisplay(){
        this.duckToTest.display();
    }
    
}
