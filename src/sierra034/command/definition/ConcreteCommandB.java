/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sierra034.command.definition;

/**
 *
 * @author Samuel Gómez
 */
public class ConcreteCommandB implements Command {
    
    private Request request;
    
    public ConcreteCommandB(Request request) {
        this.request = request;
    }

    @Override
    public void execute() {
        request.actionB();
    }
    
}
