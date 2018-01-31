/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sierra034.patterns.strategy.definition;

/**
 *
 * @author Samuel Gomez
 */
public class ConcreteStrategyA implements Strategy {

    @Override
    public void operation() {
        System.out.print("A operation");
    }
    
}
