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
    
    private Reciever request;
    
    public ConcreteCommandB(Reciever request) {
        this.request = request;
    }

    @Override
    public void execute() {
        request.actionB();
    }
    
}
