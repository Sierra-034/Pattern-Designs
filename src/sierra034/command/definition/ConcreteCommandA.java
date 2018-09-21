/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sierra034.command.definition;

/**
 *
 * @author pc
 */
public class ConcreteCommandA implements Command {
    
    private Request request;
    
    public ConcreteCommandA(Request request) {
        this.request = request;
    }

    @Override
    public void execute() {
        request.actionA();
    }
        
}
