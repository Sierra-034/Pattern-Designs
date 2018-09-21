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
public abstract class Command {
    
    protected Appliance device;
    
    public Command(Appliance device) {
        this.device = device;
    }
    
    public abstract void execute();
    
    public void setAppliance(Appliance device) {
        this.device = device;
    }
}
