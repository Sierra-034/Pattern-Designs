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
public class Light implements Appliance {

    @Override
    public void on() {
        System.out.println("Turn On Light");
    }

    @Override
    public void off() {
        System.out.println("Turn Off Light");
    }
    
}
