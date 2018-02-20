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
public class CheesePizza extends Pizza {
    
    public CheesePizza() {
        type = "CheesePizza";
    }  

    @Override
    public void prepare() {
        System.out.println("preparing " + type);
    }

    @Override
    public void bake() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void cut() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void box() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
