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
public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(int type) throws NoPizzaException {
        switch(type) {
            case PizzaType.CHEESE: return new ChicagoStyleCheesePizza();
            case PizzaType.PEPPERONI: return new ChicagoStylePepperoniPizza();
            case PizzaType.CLAM: return new ChicagoStyleClamPizza();
            case PizzaType.VEGGIE: return new ChicagoStyleVeggiePizza();
            default: throw new NoPizzaException();
        }
    }
    
}
