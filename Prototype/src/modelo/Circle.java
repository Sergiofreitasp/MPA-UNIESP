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
public final class Circle extends Shape{
    private String id;
    private String type;

    public Circle() {
    }

    public Circle(String id, String type) {
        this.id = id;
        this.type = type;
    }

    public Circle(Circle target) {
        super(target);
        if (target != null) {
            this.id = target.id;
            this.type = target.type;
        }
        
    }
    
  

    
    

    @Override
    public Shape clone() {
        return new Circle(this);
    }
    
}
