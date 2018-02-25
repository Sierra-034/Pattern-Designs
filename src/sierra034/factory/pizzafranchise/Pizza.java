/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sierra034.factory.pizzafranchise;

import java.util.ArrayList;

/**
 *
 * @author Samuel Gomez
 */
public abstract class Pizza {
    
    protected String name; 
    protected String dough; 
    protected String sauce;
    protected ArrayList toppings = new ArrayList();
    
    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding souce...");
        System.out.println("Adding toppings: ");
        for(int i = 0; i < toppings.size(); i++)
            System.out.println("\t" + toppings.get(i));
    }
    
    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }
    
    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }
    
    public void box() {
        System.out.println("Place the pizza in official PizzaStore box");
    }
    
    public String getName() {
        return name;
    }
}
