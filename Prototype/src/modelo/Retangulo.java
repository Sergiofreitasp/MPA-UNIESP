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
public class Retangulo extends Shape{
    private String id;
    private String type;

    public Retangulo() {
    }

    public Retangulo(String id, String type) {
        this.id = id;
        this.type = type;
    }
    
    public Retangulo(Retangulo target) {
        
        if (target != null) {
            this.id = target.id;
            this.type = target.type;
        }
    }

    /**
     *
     * @return
     */
    @Override
    public Shape clone() {
        return new Retangulo(this);
    }
    
}
