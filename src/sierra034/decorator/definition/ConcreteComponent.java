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
public class ConcreteComponent implements Component {

    @Override
    public void operation() {
        System.out.println("ConcreteComponent");
    }
    
}
