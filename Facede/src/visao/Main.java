/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import modelo.Facede;

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Facede f = new Facede();
        f.fachada("cpu", "start");
        f.fachada("memoria", "load");
        f.fachada("HD", "read");
    }
    
}
