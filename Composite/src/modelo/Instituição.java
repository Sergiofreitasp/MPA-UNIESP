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

    
    public Instituição(String nome, int membros) {
        this.nome = nome;
        this.membros = membros;
    }

    public int getMembros() {
        return membros;
    }
    
    

    @Override
    public int totalParticipantes() {
        return this.getMembros();
    }

    @Override
    public int totalAssentos() {
        return this.getMembros();
    }

    @Override
    public String toString() {
        return "Institui\u00e7\u00e3o{" + "nome=" + nome + ", membros=" + membros + '}';
    }
    
    
    
}
