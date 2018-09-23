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
    
    private Reciever request;
    
    public ConcreteCommandA(Reciever request) {
        this.request = request;
    }

    @Override
    public void execute() {
        request.actionA();
    }
        
}
