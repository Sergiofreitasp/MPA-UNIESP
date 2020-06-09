/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

/**
 *
 * @author Usuario
 */
public class CalzoneSQS extends Calzone{
    private String ingredientes;

    public CalzoneSQS() {
        this.ingredientes = "queijo + calabresa + tomate";
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }
    
    
    
    
}
