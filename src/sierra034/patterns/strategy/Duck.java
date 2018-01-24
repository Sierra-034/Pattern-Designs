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
public abstract class Duck {
    
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;
    
    public abstract void display();
    
    public void swim(){
        System.out.println("Swimming");
    }
    
    public void performQuack() {
        quackBehavior.quack();
    }
    
    public void performFly() {
        flyBehavior.fly();
    }
}
