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
public class Americano extends Beverage {
    
    public Americano() {
        description = "Americano";
    }

    @Override
    public double cost() {
        return 2;
    }
    
}
