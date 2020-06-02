/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class CompositeCongresso implements Participantes{
    private String nome;
    private ArrayList<Participantes> participantes;

    public CompositeCongresso(String nome) {
        this.nome = nome;
        this.participantes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Participantes> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(ArrayList<Participantes> participantes) {
        this.participantes = participantes;
    }
    
    public int totalParticipantes() {
        int tam=0;
        for(Participantes p: participantes){
            
            tam= tam + p.getMembros();   
        }
        return tam;
    }

    
    public int totalAssentos() {
        int tam=0;
        for(Participantes p: participantes){
            
            tam= tam + p.getMembros();   
        }
        return tam;
    }
    
    public int totalIndividuos() {
        int tam=0;
        for(Participantes p: participantes){
            if(p.isInst()){
                
            }else{
                tam = tam +1;
            }
        }
        return tam;
    }
    public int totalInstituiçoes() {
        int tam=0;
        for(Participantes p: participantes){
            if(p.isInst()){
                tam = tam +1;
            }else{
                
            }
        }
        return tam;
    }

    @Override
    public String toString() {
        return "CompositeCongresso{" + "nome=" + nome + ", participantes=" + participantes + '}';
    }

    @Override
    public boolean isInst() {
        return true;
    }

    @Override
    public int getMembros() {
        return 0;
    }
    public void add(Participantes p){
        participantes.add(p);
    }
    public void remove(Participantes p){
        participantes.remove(p);
    }
    
}
