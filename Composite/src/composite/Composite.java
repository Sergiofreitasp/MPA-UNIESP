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
        
        
        Individuo steve = new Individuo ("awqwr", "Steve");
        Individuo stevia = new Individuo ("adjfasdjfn", "Stevia");
        
        Instituição ifpb = new Instituição("ifpb", 12);
        Instituição ufpb = new Instituição("ufpb", 10);
        
        CompositeCongresso cc1 = new CompositeCongresso("comgresso tec");
        cc1.add(steve);
        cc1.add(stevia);
        cc1.add(ifpb);
        cc1.add(ufpb);
        
        System.out.println(cc1.totalParticipantes());
        System.out.println(cc1.totalInstituiçoes());
        
    }
    
}
