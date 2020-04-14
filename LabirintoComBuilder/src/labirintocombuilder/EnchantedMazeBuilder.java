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
public class EnchantedMazeBuilder extends MazeBuilder{

    public EnchantedMazeBuilder() {
    }

    
    @Override
    public void makeRoom() {
        maze.setRoom("ROOM ENCANTADA");
    }

    @Override
    public void makeWall() {
        maze.setWall("WALL ENCANTADO");
    }

    @Override
    public void makeDoor() {
        maze.setDoor("DOOR ENCANTADO");
    }
    
}
