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
public class TamanhoFamilia extends AbstracaoTamanho{
    public TamanhoFamilia(ImplementacaoRefrigerante refrigerante) {
     super(refrigerante);
    }
    public void beber() {
        System.out.println("Toma um gole de " + refrigerante.toString());
        System.out.println("Toma um gole de " + refrigerante.toString());
        System.out.println("Toma um gole de " + refrigerante.toString() + "! Ahhhh!");
        System.out.println("Toma um gole de " + refrigerante.toString());
        System.out.println("Toma um gole de " + refrigerante.toString());
        System.out.println("Acabou o(a) " + refrigerante.toString());
        System.out.println();
    }
}
