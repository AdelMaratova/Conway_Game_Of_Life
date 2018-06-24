/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gol;

/**
 *
 * @author User
 */
public class GOL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creating object named "life" of GameOfLife type
        GameOfLife life = new GameOfLife();
        //brings everything to the middle of the screen
        life.setLocationRelativeTo(null);
        life.show();
    }
    
}
