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
public class Facede {
    public  String fachada(String nomeProcesso, String metodo){
        Cpu cpu1 = new Cpu("cpus");
        Memoria m1 = new Memoria("memo");
        HardDrive hd1 = new HardDrive("hds");
        
        if ((nomeProcesso.equals("cpu")) && (metodo.equals("start"))){
            return cpu1.start();
        }else if((nomeProcesso.equals("cpu")) && (metodo.equals("execute"))){
            return cpu1.execute();
        }else if((nomeProcesso.equals("cpu")) && (metodo.equals("load"))){
            return cpu1.load();
            //ficou repetitivo pulei alguns!
        }else if((nomeProcesso.equals("memoria")) && (metodo.equals("load"))){
            return m1.load();
        }else if((nomeProcesso.equals("HD")) && (metodo.equals("read"))){
            return hd1.read();
        }else{
            return "Nao implementado ainda";
        }
        
    }
}
