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
public abstract class Decorator implements Component {
    
    protected Component decorated;
    
    public void setComponent(Component component) {
        decorated = component;
    }

    @Override
    public abstract void operation();
    
}
