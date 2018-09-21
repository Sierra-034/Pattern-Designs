/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sierra034.command.definition;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Samuel Gómez
 */
public class Invoker {
    
    private List<Command> commandList = new ArrayList<Command>();
    
    public void addCommand(Command command) {
        commandList.add(command);
    }
    
    public void executeCommands() {
        for(Command c : commandList) 
            c.execute();
        
        commandList.clear();
    }
}
