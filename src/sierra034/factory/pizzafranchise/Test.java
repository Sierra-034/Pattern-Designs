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
public class Test {

    /**
     * @param args the command line arguments
     * @throws sierra034.factory.pizzafranchise.NoPizzaException
     */
    public static void main(String[] args) throws NoPizzaException {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        
        Pizza pizza = nyPizzaStore.orderPizza(PizzaType.CHEESE_PIZZA);
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");
        
        pizza = chicagoPizzaStore.orderPizza(PizzaType.CHEESE_PIZZA);
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
    
}
