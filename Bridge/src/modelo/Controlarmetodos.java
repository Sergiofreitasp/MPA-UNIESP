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
public class Controlarmetodos {
    private Publicação publicação;

    public Controlarmetodos(Publicação publicação) {
        this.publicação = publicação;
    }
    
    public String implXML(Publicação p){
        return "Implemntar XML";
    }
    
    public String implBD(Publicação p){
         return "Implemntar BD";
    }
}
