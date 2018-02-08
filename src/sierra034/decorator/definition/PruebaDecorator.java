/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sierra034.decorator.definition;

/**
 *
 * @author Samuel Gomez
 */
public class PruebaDecorator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        component.operation();
        
        Decorator decorator = new ConcreteDecorator();
        decorator.setComponent(component);
        decorator.operation();
    }
    
}
