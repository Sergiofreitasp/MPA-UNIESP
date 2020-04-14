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
public class Maze {
    private String room;
    private String wall;
    private String door;

    public Maze() {
    }

    public Maze(String room, String wall, String door) {
        this.room = room;
        this.wall = wall;
        this.door = door;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    @Override
    public String toString() {
        return "Maze{" + "room=" + room + ", wall=" + wall + ", door=" + door + '}';
    }
    
}

    