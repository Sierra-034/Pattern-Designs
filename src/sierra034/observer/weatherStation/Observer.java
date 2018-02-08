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
public interface Observer {
    
    void update( float temp, float humidity, float pressure );
}
