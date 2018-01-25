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
public class Troll extends Character {
    
    public Troll() {
        this.weapon = new AxeBehavior();
    }
}
