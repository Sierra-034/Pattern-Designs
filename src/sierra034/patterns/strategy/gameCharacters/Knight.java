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
public class Knight extends Character {
    
    public Knight() {
        this.weapon = new BowAndArrowBehavior();
    }
}
