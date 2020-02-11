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
public class Funcionario {
    private int idfunc;
    private String nomeFunc;
    private String filial;
    
    public String solicitarAluguel(Jogo idJogo){
        return "Alugado";
    }
    public void finalizarCompra(){
        // float???
        System.out.println("Compra finalizada!");
    }
}
