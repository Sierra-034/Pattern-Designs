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
public class King extends Character {
    
    public King() {
        this.weapon = new SwordBehavior();
    }
}
