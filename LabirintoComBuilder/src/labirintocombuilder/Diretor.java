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
public class Diretor {
    protected MazeBuilder mb;

    public Diretor(MazeBuilder mb) {
        this.mb = mb;
    }
    
    public void makeMaze(){
        mb.makeRoom();
        mb.makeWall();
        mb.makeDoor();
    }
    public Maze getMaze(){
        return mb.getMaze();
    }
}
