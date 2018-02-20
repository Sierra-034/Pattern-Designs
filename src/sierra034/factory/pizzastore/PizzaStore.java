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
public class PizzaStore {
    
    private SimplePizzaFactory factory;
    
    public Pizza orderPizza(int pizzaType) {
        Pizza pizza = SimplePizzaFactory.createPizza(pizzaType);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        
        return pizza;
    }
}
