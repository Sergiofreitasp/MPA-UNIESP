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
public class Memoria {
    private String memo;

    public Memoria(String memo) {
        this.memo = memo;
    }

    public Memoria() {
        
    }
    
    public String load(){
        return("Deu load");
    }
    
    public String free(){
        return("Deu free");
    }
}
