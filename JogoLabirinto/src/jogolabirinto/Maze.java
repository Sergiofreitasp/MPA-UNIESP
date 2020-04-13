/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogolabirinto;

/**
 *
 * @author Usuario
 */
public class Maze {
    public AbstractRoom room;
    public AbstractWall wall;
    public AbstractDoor door;

    public Maze() {
    }

    public AbstractRoom getRoom() {
        return room;
    }

    public void setRoom(AbstractRoom room) {
        this.room = room;
    }

    public AbstractWall getWall() {
        return wall;
    }

    public void setWall(AbstractWall wall) {
        this.wall = wall;
    }

    public AbstractDoor getDoor() {
        return door;
    }

    public void setDoor(AbstractDoor door) {
        this.door = door;
    }
    
    
}
