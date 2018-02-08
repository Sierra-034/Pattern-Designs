/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sierra034.decorator.starbuzzcoffee;

/**
 *
 * @author Samuel Gomez
 */
public class Mocha extends CondimentDecorator {
    
    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return decorated.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return 0.20 + decorated.cost();
    }
}
