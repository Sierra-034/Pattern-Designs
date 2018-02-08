/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sierra034.strategy.gamecharacters;

/**
 *
 * @author Samuel Gomez
 */
public abstract class Character {
    
    protected WeaponBehavior weapon;
    
    public void fight() {
        this.weapon.useWeapon();
    }
    
    public void setWeapon( WeaponBehavior wb ) {
        this.weapon = wb;
    }
}
