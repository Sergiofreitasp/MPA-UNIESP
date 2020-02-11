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
public class JogoDigital extends Jogo{
    private int anoCriacao;
    private String produtora;
    
    public void calcularTotal(){
        float total = this.getQuantidadeJogos()*this.getPrecoAuguel();
        System.out.println("Total:" + total);
    }
}
