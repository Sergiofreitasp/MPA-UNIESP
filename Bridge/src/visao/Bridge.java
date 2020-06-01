/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import modelo.Controlarmetodos;
import modelo.Livro;

/**
 *
 * @author Usuario
 */
public class Bridge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Livro l1 = new Livro("a noite", "J.K.R.", "32423");
        Controlarmetodos cm = new Controlarmetodos(l1);
        cm.implBD(l1);
    }
    
}
