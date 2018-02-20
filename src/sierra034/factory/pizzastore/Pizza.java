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
public abstract class Pizza {
    
    protected String type;
    
    public abstract void prepare();
    public abstract void bake();
    public abstract void cut();
    public abstract void box();
}
