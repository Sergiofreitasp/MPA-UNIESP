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
public class MazeFactory extends AbstractMazeFactory{

    @Override
    public AbstractWall makeWall() {
        return new Wall();
    }

    @Override
    public AbstractRoom makeRoom() {
        return new Room();
    }

    @Override
    public AbstractDoor makeDoor() {
        return new Door();
    }
    
}
