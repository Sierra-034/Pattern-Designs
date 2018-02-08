/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sierra034.tests.strategy.definition;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import sierra034.strategy.definition.ConcreteStrategyA;
import sierra034.strategy.definition.ConcreteStrategyB;
import sierra034.strategy.definition.StrategyClient;

/**
 *
 * @author Samuel Gomez
 */
public class TestStrategyClient {
    
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final String CONCRETE_STRATEGY_A_MESSAGE = "A operation";
    private final String CONCRETE_STRATEGY_B_MESSAGE = "B operation";
    private StrategyClient strategyClient = new StrategyClient();
    
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }
    
    @After
    public void restoreStreams() {
        System.setOut(System.out);
        System.setErr(System.err);
    }
    
    @Test 
    public void testPerformOperationA() {
        strategyClient.setStrategy(new ConcreteStrategyA());
        strategyClient.performOperation();
        
        String actual = outContent.toString();
        String expected = CONCRETE_STRATEGY_A_MESSAGE;
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPerformOperationB() {
        strategyClient.setStrategy(new ConcreteStrategyB());
        strategyClient.performOperation();
        
        String actual = outContent.toString();
        String expected = CONCRETE_STRATEGY_B_MESSAGE;
        assertEquals(expected, actual);
    }
}
