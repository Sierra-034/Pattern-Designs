/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sierra034.patterns.strategy;

/**
 *
 * @author Samuel Gomez
 */
public class DekoyDuck extends Duck {
    
    @Override 
    public void quack() {
        //Override to do nothing
    }
    
    @Override
    public void fly() {
        //Override to do nothing 
    }

    @Override
    public void display() {
        System.out.println("Looks like Dekoy duck");
    }
    
}
