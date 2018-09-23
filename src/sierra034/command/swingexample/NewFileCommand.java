/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sierra034.command.swingexample;

/**
 *
 * @author Samuel Gómez
 */
public class NewFileCommand implements Command {
    
    private String name;
    private NewFileAction newFilaAction = new NewFileAction();

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void execute() {
        newFilaAction.newFile(name);
    }
    
}
