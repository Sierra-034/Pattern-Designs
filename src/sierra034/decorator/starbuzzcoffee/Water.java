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
public class Water extends CondimentDecorator {
    
    public Water(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return decorated.getDescription() + " , Water";
    }

    @Override
    public double cost() {
        return decorated.cost() + 0.25;
    }
    
}
