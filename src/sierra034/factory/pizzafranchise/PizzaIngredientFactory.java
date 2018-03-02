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
public interface PizzaIngredientFactory {
    
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Clams createClam();
}
