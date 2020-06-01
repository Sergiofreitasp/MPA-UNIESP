/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import java.util.ArrayList;
import modelo.CompositeCongresso;
import modelo.Individuo;
import modelo.Instituição;

/**
 *
 * @author Usuario
 */
public class Composite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Individuo> individuos;
        individuos = new ArrayList<Individuo>();
        
        Individuo steve = new Individuo ("awqwr", "Steve");
        Individuo stevia = new Individuo ("adjfasdjfn", "Stevia");
        individuos.add(steve);
        individuos.add(stevia);
        
        ArrayList<Instituição> instotuiçoes;
        instotuiçoes = new ArrayList<Instituição>();
        
        Instituição ifpb = new Instituição("ifpb", 50);
        Instituição ufpb = new Instituição("ufpb", 73);
        instotuiçoes.add(ifpb);
        instotuiçoes.add(ufpb);
     
        
        CompositeCongresso cc = new CompositeCongresso(individuos, instotuiçoes);
        System.out.println("Participantes: " + cc.totalParticipantes());
        System.out.println("assentos: " + cc.totalAssentos());
        System.out.println("ind: " + cc.totalIndividuos() + "inst: " + cc.totalInstituiçoes());
        
    }
    
}
