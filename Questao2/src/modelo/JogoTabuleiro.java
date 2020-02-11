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
public class JogoTabuleiro extends Jogo{
    private String estilo;
    private ArrayList<String> adereco;
    
    public void calcularTotal(){
        float total = this.getQuantidadeJogos()*this.getPrecoAuguel();
        System.out.println("Total:" + total);
    }
}
