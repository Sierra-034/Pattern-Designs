/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sierra034.observer.javalib;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Samuel Gomez
 */
public class CurrentConditionDisplay implements Observer {
    
    private Observable station;
    private float temperature;
    private float humidity;
    
    public CurrentConditionDisplay(Observable station) {
        this.station = station;
        station.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof Observable) {
            WeatherData weatherData = (WeatherData) o;
            temperature = weatherData.getTemperature();
            humidity = weatherData.getHumidity();
            display();
        }
    }
    
    public void display() {
        System.out.printf("Current conditions: %.2f F degrees \n%.2f percent humidity\n",
                temperature, humidity);
    }
    
}
