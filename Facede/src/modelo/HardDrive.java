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
public class HardDrive {
    private String hd;

    public HardDrive(String hd) {
        this.hd = hd;
    }

    public HardDrive() {
    }
    
    public String read(){
        return("Deu read");
    }
    
    public String write(){
        return("Deu write");
    }
}
