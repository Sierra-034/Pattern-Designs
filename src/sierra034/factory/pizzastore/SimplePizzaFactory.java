/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sierra034.factory.pizzastore;

/**
 *
 * @author Samuel Gomez
 */
public class SimplePizzaFactory {
    
    public static Pizza createPizza(int type) {
        switch(type) {
            case PizzaType.CHEESE: return new CheesePizza();
            case PizzaType.VEGGIE: return new VeggiePizza();
            case PizzaType.CLAM: return new ClamPizza();
            case PizzaType.PEPPERONI: return new PepperoniPizza();
            
            default: return new DefaultPizza();
        }
    }
}
