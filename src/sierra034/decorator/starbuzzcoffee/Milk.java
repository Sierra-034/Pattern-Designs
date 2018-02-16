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
public class Milk extends CondimentDecorator {
    
    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return decorated.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return decorated.cost() + 1;
    }
    
}
