/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sierra034.patterns.strategy.gameCharacters;

/**
 *
 * @author Samuel Gomez
 */
public class AxeBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("Cutting with an Axe");
    }
    
}
