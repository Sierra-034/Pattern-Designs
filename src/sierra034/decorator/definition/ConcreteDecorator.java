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
public class ConcreteDecorator extends Decorator {

    @Override
    public void operation() {
        decorated.operation();
        System.out.println("ConcreteDecorator");
    }
    
}
