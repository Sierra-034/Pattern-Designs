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
public abstract class CondimentDecorator extends Beverage {
    
    protected Beverage decorated;
    
    public CondimentDecorator(Beverage beverage) {
        decorated = beverage;
    }
    
    @Override
    public abstract String getDescription();
}
