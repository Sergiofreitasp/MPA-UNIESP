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
public class JogoRV extends JogoDigital{
    private String tipoCapacete;
    private String estereoscopia;
    
    public void calcularTotal(){
        float total = this.getQuantidadeJogos()*this.getPrecoAuguel();
        System.out.println("Total:" + total);
    }
}
