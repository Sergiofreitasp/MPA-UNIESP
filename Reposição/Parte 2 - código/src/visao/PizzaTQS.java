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
public class PizzaTQS extends Pizza{
    private String ingredientes;

    public PizzaTQS() {
        this.ingredientes = "queijo + presunto + tomate";
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }
    
    
}
