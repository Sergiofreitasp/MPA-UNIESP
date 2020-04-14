/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labirintocombuilder;

/**
 *
 * @author Usuario
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Diretor d1 = new Diretor(new NormalMazeBuilder());
        d1.makeMaze();
        
        Maze maze1 = d1.getMaze();
        
        System.out.println("Room:" + maze1.getRoom());
    }
    
}
