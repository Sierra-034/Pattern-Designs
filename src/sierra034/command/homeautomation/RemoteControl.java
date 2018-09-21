/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sierra034.command.homeautomation;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Samuel Gómez
 */
public class RemoteControl {
    
    private List<Command> commandList = new ArrayList<Command>();
    
    public void addCommand(Command command) {
        commandList.add(command);
    }
    
    public void executeCommands() {
        for(Command command : commandList) 
            command.execute();
    }
    
    public void clearCommands() {
        commandList.clear();
    }
}
