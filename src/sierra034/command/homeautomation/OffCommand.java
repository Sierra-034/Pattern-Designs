/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sierra034.command.homeautomation;

/**
 *
 * @author Samuel Gómez
 */
public class OffCommand extends Command {

    public OffCommand(Appliance device) { super(device); }

    @Override
    public void execute() {
        device.off();
    }
    
}
