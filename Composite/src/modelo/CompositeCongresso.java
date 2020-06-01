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
    private ArrayList<Individuo> ind;
    private ArrayList<Instituição> inst;

   
    public CompositeCongresso(ArrayList<Individuo> ind, ArrayList<Instituição> inst) {
        this.ind = ind;
        this.inst = inst;
    }

    public ArrayList<Individuo> getInd() {
        return ind;
    }

    public void setInd(ArrayList<Individuo> ind) {
        this.ind = ind;
    }

    public ArrayList<Instituição> getInst() {
        return inst;
    }

    public void setInst(ArrayList<Instituição> inst) {
        this.inst = inst;
    }
    
    

    @Override
    public int totalParticipantes() {
        int totIND = ind.size();
        int totINST = 0;
        
        for (Instituição i: inst){
            totINST = totINST + i.getMembros();
        }
        return totIND + totINST;
    }

    @Override
    public int totalAssentos() {
        int totIND = ind.size();
        int totINST = 0;
        
        for (Instituição i: inst){
            totINST = totINST + i.getMembros();
        }
        return totIND + totINST;
    }
    public int totalIndividuos() {
        return ind.size();
    }
    public int totalInstituiçoes() {
        return inst.size();
    }

    @Override
    public String toString() {
        return "CompositeCongresso{" + "ind=" + ind + ", inst=" + inst + '}';
    }
    
}
