/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sierra034.test.command;

import sierra034.command.definition.Command;
import sierra034.command.definition.ConcreteCommandA;
import sierra034.command.definition.ConcreteCommandB;
import sierra034.command.definition.Invoker;
import sierra034.command.definition.Request;

/**
 *
 * @author Samuel Gómez
 */
public class DefinitionDemo {

    public static void main(String[] args) {
        Request request = new Request();
        
        Command commandA = new ConcreteCommandA(request);
        Command commandB = new ConcreteCommandB(request);
        
        Invoker inv = new Invoker();
        inv.addCommand(commandA);
        inv.addCommand(commandB);
        
        inv.executeCommands();
    }
    
}
