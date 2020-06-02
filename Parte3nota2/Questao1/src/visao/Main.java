/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import modelo.CocaCola;
import modelo.FantaUva;
import modelo.ImplementacaoRefrigerante;
import modelo.TamanhoFamilia;
import modelo.TamanhoPequeno;

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        testeBeberTamanhoFamilia(new FantaUva());
        testeBeberTamanhoPequeno(new CocaCola());
    }
    
    public static void testeBeberTamanhoFamilia(ImplementacaoRefrigerante refri){
        TamanhoFamilia tf1 = new TamanhoFamilia(refri);
        tf1.beber();
    }
    public static void testeBeberTamanhoPequeno(ImplementacaoRefrigerante refri){
        TamanhoPequeno tp1 = new TamanhoPequeno(refri);
        tp1.beber();
    }
}
