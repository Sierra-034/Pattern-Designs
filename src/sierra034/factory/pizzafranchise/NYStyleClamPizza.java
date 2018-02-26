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
public class NYStyleClamPizza extends Pizza {
    
    public NYStyleClamPizza() {
        name = "NY Style Clam Pizza"; 
        dough = "NY dough";
        sauce = "Valentina sauce";
        
        toppings.add("Clam");
    }
}
