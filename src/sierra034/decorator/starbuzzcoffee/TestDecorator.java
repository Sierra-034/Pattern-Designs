/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sierra034.decorator.starbuzzcoffee;

/**
 *
 * @author Samuel Gomez
 */
public class TestDecorator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Beverage americano = new Water(new Americano());
        americano = new Mocha(americano);
        String description = americano.getDescription();
        System.out.println(description);
    }
    
}
