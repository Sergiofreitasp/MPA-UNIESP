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
public class Cpu {
    private String cpu;

    public Cpu() {
    }

    public Cpu(String cpu) {
        this.cpu = cpu;
    }
    
    
    
    public String start(){
        System.out.println("Deu Start");
        return "Deu Start";
    }
    
    public String execute(){
        return ("Deu execute");
    }
    
    public String load(){
        return("Deu load");
    }
    
    public String free(){
        return("Deu free");
    }
}
