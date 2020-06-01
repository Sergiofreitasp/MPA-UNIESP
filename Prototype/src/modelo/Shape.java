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
public abstract class Shape {
    private String id;
    private String type;

    public Shape() {
    }

    public Shape(Shape target) {
        if (target != null){
            this.id = target.id;
            this.type = target.type;
        }
        
    }

    public String getId() {
        return id;
    }
    
    

    public void setId(String id){
        this.id = id;
    }
    

    public String getType(){
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public abstract Shape clone();
}
