/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sierra034.factory.pizzafranchise;

/**
 *
 * @author Samuel Gomez
 */
public class ChicagoStylePizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(int type) throws NoPizzaException {
        switch(type) {
            case PizzaType.CHICAGOSTYLE_CHEESE_PIZZA: return new ChicagoStyleCheesePizza();
            default: throw new NoPizzaException();
        }
    }
    
}
