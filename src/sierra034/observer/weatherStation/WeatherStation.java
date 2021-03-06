/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sierra034.observer.weatherStation;

/**
 *
 * @author Samuel Gomez
 */
public class WeatherStation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        WeatherData weatherData = new WeatherData();
        
        CurrentConditionsDisplay currentCondition = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statistics = new StatisticsDisplay(weatherData);
//        ForecastDisplay forecast = new ForecastDisplay(weatherData);
        
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
    
}
