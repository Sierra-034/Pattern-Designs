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
public class TacticContext {
    
    private FootballStrategy strategy;
    
    public TacticContext() {
        strategy = new NeutralTactic();
    }
    
    public void confirmTactic(String team) {
        strategy.adhereTactic(team);
    }
    
    public FootballStrategy getStrategy() {
        return strategy;
    }
    
    public void setStrategy(FootballStrategy strategy) {
        this.strategy = strategy;
    }
}
