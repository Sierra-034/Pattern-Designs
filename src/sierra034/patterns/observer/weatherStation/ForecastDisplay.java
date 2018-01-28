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
public class ForecastDisplay implements Observer, DisplayElement {
    
    public ForecastDisplay(Subject subject) {
        subject.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
