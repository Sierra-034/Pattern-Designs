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
public class StatisticsDisplay implements Observer, DisplayElement {
    
    private final int SAMPLES_PER_HOUR = 60;
    private int CURRENT_MEASUREMENT = 0;
    private float[] temperaturesInAnHour;
    
    private float averageTemp = 0;
    
    public StatisticsDisplay(Subject subject) {
        subject.registerObserver(this);
        temperaturesInAnHour = new float[SAMPLES_PER_HOUR];
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        
        temperaturesInAnHour[CURRENT_MEASUREMENT] = temp;
        
        float sum = temp;
        for (int i = 0; i < CURRENT_MEASUREMENT; i++) {
            sum += temperaturesInAnHour[i];
        }
        
        averageTemp = sum / (CURRENT_MEASUREMENT + 1);
        CURRENT_MEASUREMENT++;
        display();
    }

    @Override
    public void display() {
        System.out.println("The actual average temp is: " + averageTemp);
    }
    
}
