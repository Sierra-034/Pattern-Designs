/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sierra034.strategy.definition;

/**
 *
 * @author Samuel Gomez
 */
public class StrategyClient {
    
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    
    public void performOperation() { 
        strategy.operation();
    }
}
