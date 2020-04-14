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
public class NormalMazeBuilder extends MazeBuilder{

    public NormalMazeBuilder() {
    }

    

    @Override
    public void makeRoom() {
        maze.setRoom("ROOM NORMAL");
    }

    @Override
    public void makeWall() {
        maze.setWall("WALL NORMAL");
    }

    @Override
    public void makeDoor() {
        maze.setDoor("DOOR NORMAL");
    }
    
}
