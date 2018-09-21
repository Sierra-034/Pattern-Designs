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
public class Stereo implements Appliance {
    
    private String cdName;
    private int volume;

    @Override
    public void on() {
        System.out.println("Turn On Stereo");
    }

    @Override
    public void off() {
        System.out.println("Turn Off Stereo");
    }
    
    public void setCd(String cdName) {
        this.cdName = cdName;
    }
    
    public void setVolume(int volume) {
        this.volume = volume;
    }
    
}
