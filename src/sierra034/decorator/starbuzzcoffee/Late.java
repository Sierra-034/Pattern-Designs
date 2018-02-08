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
public class Late extends CondimentDecorator {

    public Late(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return decorated.getDescription() + ", Late";
    }

    @Override
    public double cost() {
        return 0.70 + decorated.cost();
    }
    
}
