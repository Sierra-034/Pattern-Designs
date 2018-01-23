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
    
    public void quack(){
        System.out.println("Quacking");
    }
    
    public void swim(){
        System.out.println("Swimming");
    }
    
    public void fly(){
        System.out.println("Flying");
    }
    
    public abstract void display();
}
