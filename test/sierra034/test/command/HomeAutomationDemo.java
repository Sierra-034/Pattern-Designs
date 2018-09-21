/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sierra034.test.command;

import sierra034.command.homeautomation.Appliance;
import sierra034.command.homeautomation.Command;
import sierra034.command.homeautomation.Light;
import sierra034.command.homeautomation.OffCommand;
import sierra034.command.homeautomation.OnCommand;
import sierra034.command.homeautomation.RemoteControl;
import sierra034.command.homeautomation.Stereo;

/**
 *
 * @author Samuel Gómez
 */
public class HomeAutomationDemo {

    public static void main(String[] args) {
        Appliance stereo = new Stereo();
        Appliance roomLight = new Light();
        
        Command onCommand = new OnCommand(stereo);
        Command offCommand = new OffCommand(roomLight);
        
        RemoteControl rmControl = new RemoteControl();
        rmControl.addCommand(onCommand);
        rmControl.addCommand(offCommand);
        
        rmControl.executeCommands();
        rmControl.clearCommands();
    }
    
}
