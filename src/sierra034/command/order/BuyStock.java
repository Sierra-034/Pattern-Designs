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

// Create concrete classes implementing the Order interface
public class BuyStock implements Order {
    
    private Stock abcStock;
    
    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
    
}
