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
public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(int type) throws NoPizzaException {
        switch(type) {
            case PizzaType.CHEESE: return new NYStyleCheesePizza();
            case PizzaType.PEPPERONI: return new NYStylePepperoniPizza();
            case PizzaType.CLAM: return new NYStyleClamPizza();
            case PizzaType.VEGGIE: return new NYStyleVeggiePizza();
            default: throw new NoPizzaException();
        }
    }
    
}
