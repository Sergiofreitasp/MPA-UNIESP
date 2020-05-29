/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitorexemplo;

import Modelo.DescontoVisitor;
import Modelo.Iphone;
import Modelo.Macbook;
import Modelo.Produto;

/**
 *
 * @author Usuario
 */
public class SacoladeCompras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Lista de Itens
        Produto[] produtos = new Produto[]{
            new Iphone("1811", "X super max PRO", 6599), new Macbook("1818", "Mac PRO", 4999)
        
        };
        float total= calcularpreco(produtos);
        System.out.println("O custo total dos seus itens é: " + total);
    }
    
    public static float calcularpreco(Produto produtos[]){
        // Buscar o desconto
        DescontoVisitor v = new DescontoVisitor();
        float soma = 0;
        for(Produto p: produtos){
            soma = soma + p.accept(v);
        }
        return soma;
    }
}
