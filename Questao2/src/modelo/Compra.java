/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Compra {
    private ArrayList<Jogo> jogo;
    private int tempo;
    private Cliente cliente;
    private Funcionario fun;
    private String atributoQuatro;
    
    
    public float calcularCompra(){
        float tot = (jogo.size())*tempo; 
        return tot;
    }
}
