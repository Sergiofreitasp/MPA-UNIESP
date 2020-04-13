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
public abstract class AbstractMazeFactory {
    public AbstractMazeFactory (){}
    
    public abstract AbstractWall makeWall();
    public abstract AbstractRoom makeRoom();
    public abstract AbstractDoor makeDoor();
}
