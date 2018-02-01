/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sierra034.patterns.strategy.football;

/**
 *
 * @author Samuel Gomez
 */
public interface FootballStrategy {
    
    String NEUTRAL_MESSAGE = " will play neutral";
    String ATTACK_MESSAGE = " will play in attacking football";
    String DEFENCE_MESSAGE = " will make emphasis on defence!";
    
    void adhereTactic(String team);
}
