/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sierra034.test.command;

import sierra034.command.order.Broker;
import sierra034.command.order.BuyStock;
import sierra034.command.order.SellStock;
import sierra034.command.order.Stock;

/**
 *
 * @author Samuel Gómez
 */
public class OrderDemo {

    public static void main(String[] args) {
        Stock abcStock = new Stock();
        
        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);
        
        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);
        
        broker.placeOrders();
    }
    
}
