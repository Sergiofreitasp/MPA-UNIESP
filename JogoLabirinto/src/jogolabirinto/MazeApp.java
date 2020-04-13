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
public class MazeApp {

    public static Maze makeMaze(String tipoMaze){
        AbstractMazeFactory amf = null;
        if(tipoMaze.equals("normal")){
            amf = new MazeFactory();
        }else if(tipoMaze.equals("encantado")){
            amf = new EnchantedMazeFactory();
        }
        
        Maze m1 = new Maze();
        m1.setRoom(amf.makeRoom());
        m1.setWall(amf.makeWall());
        m1.setDoor(amf.makeDoor());
        
        return m1;
        
    }
    public static void main(String[] args) {
        Maze m1 = makeMaze("encantado");
        Maze m2 = makeMaze("normal");
    }
    
}
