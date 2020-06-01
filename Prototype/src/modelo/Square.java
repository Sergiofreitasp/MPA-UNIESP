/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class Square extends Shape{
    private String id;
    private String type;

    public Square() {
    }

    public Square(String id, String type) {
        this.id = id;
        this.type = type;
    }
    
    public Square(Square target) {
        super(target);
        if (target != null) {
            this.id = target.id;
            this.type = target.type;
            
        }
    }

    @Override
    public Shape clone() {
        return new Square(this);
    }
    
}
