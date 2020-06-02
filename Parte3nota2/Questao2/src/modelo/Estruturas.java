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
public interface Estruturas {
    public String copiar();
    public String mover(Estruturas e, String diretorio);
    public Float getTamanho();
    public String getNome();
        
}
