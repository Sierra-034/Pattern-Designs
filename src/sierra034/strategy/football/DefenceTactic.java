/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sierra034.strategy.football;

/**
 *
 * @author Samuel Gomez
 */
public class DefenceTactic implements FootballStrategy {

    @Override
    public void adhereTactic(String team) {
        System.out.print(team + DEFENCE_MESSAGE);
    }
    
}
