/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sierra034.patterns.observer.weatherStation;

/**
 *
 * @author Samuel Gomez
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Subject WeatherData;
    
    public CurrentConditionsDisplay(Subject subject) {
        subject.registerObserver(this);
    }
    
    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature
            + "F degrees and " + humidity + "% humidity");
    }
    
}
