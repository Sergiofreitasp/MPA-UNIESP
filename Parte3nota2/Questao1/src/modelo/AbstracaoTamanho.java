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
public abstract class AbstracaoTamanho {
    protected ImplementacaoRefrigerante refrigerante;
    
    public AbstracaoTamanho(ImplementacaoRefrigerante refrigerante){
        this.refrigerante = refrigerante;
    }
    
    public abstract void beber();
  
}
