/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sierra034.tests.strategy;

import org.junit.Test;
import static org.junit.Assert.*;
import sierra034.patterns.strategy.MallardDuck;

/**
 *
 * @author Samuel Gomez
 */
public class TestMallardDuck extends TestDuck {
    
    public TestMallardDuck() {
        duckToTest = new MallardDuck();
    }
    
}
