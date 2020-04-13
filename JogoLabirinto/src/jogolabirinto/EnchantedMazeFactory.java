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
public class EnchantedMazeFactory extends AbstractMazeFactory{
    public EnchantedMazeFactory(){}

    
    @Override
    public AbstractWall makeWall() {
        return new EnchantedWall();
    }
    

    @Override
    public AbstractRoom makeRoom() {
        return new EnchantedRoom();
    }

    @Override
    public AbstractDoor makeDoor() {
        return new EnchantedDoor();
    }
        
    
}
