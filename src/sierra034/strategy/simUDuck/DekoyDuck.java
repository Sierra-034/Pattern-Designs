/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sierra034.strategy.simUDuck;

/**
 *
 * @author Samuel Gomez
 */
public class DekoyDuck extends Duck {
    
    public DekoyDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("Looks like Dekoy duck");
    }
    
}
