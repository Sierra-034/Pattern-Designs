/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sierra034.test.command;

import sierra034.command.swingexample.Command;
import sierra034.command.swingexample.NewFileAction;
import sierra034.command.swingexample.NewFileCommand;

/**
 *
 * @author Samuel Gómez
 */
public class SwingDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NewFileCommand newFile = new NewFileCommand();
        newFile.setName("myfile.txt");
        newFile.execute();
    }
    
}
