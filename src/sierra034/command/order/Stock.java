/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sierra034.command.order;

/**
 *
 * @author Samuel Gómez
 */

//Request class
public class Stock {
    
    private String name = "ABC";
    private int quantity = 10;
    
    public void buy() {
        System.out.printf("Stock [ Name: %s, Quantity: %d ] bought\n", 
                name, quantity);
    }
    
    public void sell() {
        System.out.printf("Stock [ Name: %s, Quantity: %d ] sold\n", 
                name, quantity);
    }
}
