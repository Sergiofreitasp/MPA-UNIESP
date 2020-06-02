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
public class Instituição implements Participantes{
    private String nome;
    private int membros;
    private boolean inst;

    
    public Instituição(String nome, int membros) {
        this.nome = nome;
        this.membros = membros;
        this.inst = true;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }

    public boolean isInst() {
        return true;
    }

    public void setInst(boolean inst) {
        this.inst = inst;
    }

    @Override
    public String toString() {
        return "Institui\u00e7\u00e3o{" + "nome=" + nome + ", membros=" + membros + ", inst=" + inst + '}';
    }
    

    
    
    

   
    
    
}
