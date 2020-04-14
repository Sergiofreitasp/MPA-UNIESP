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
public abstract class  MazeBuilder {
    protected Maze maze;

    public MazeBuilder() {
        maze = new Maze();
    }
    
    
    public abstract void makeRoom();
    public abstract void makeWall();
    public abstract void makeDoor();
    
    public Maze getMaze(){
        return maze;
    }
    
}
