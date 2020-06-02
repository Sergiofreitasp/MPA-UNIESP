/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;


import modelo.Arquivos;
import modelo.CompositeEstruturas;
import modelo.Estruturas;


/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Arquivos a1 = new Arquivos("doc1", (float) 11);
        Arquivos a2 = new Arquivos("doc2", (float) 11);
        
        CompositeEstruturas cp1 = new CompositeEstruturas("Nova Pasta");
        
        cp1.add(a1);
        cp1.add(a2);
        
        CompositeEstruturas cp2 = new CompositeEstruturas("Nova Pasta2");
        cp2.add(cp1);
        
        cp2.getNames();
        cp2.getTamanho();
        
    }
    
}
