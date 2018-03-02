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
        PizzaIngredientFactory ingredientFactory = new NyPizzaIngredientFactory();
        switch(type) {
            case PizzaType.CHEESE: return new CheesePizza(ingredientFactory);
            case PizzaType.CLAM: return new ClamPizza(ingredientFactory);
            default: throw new NoPizzaException();
        }
    }
    
}
