/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class CompositeEstruturas implements Estruturas{
    private String nome;
    private List<Estruturas> compo;
    private float tamanho;

    public CompositeEstruturas(String nome) {
        this.nome = nome;
        this.compo = new ArrayList<>(); 
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getNames(){
        
        for(Estruturas e: compo){
            System.out.println(e.getNome());
        }
        System.out.println("Fim!");
        return "Deu certo";
    }
    
    @Override
    public String toString() {
        return "CompositeEstruturas{" + "nome=" + nome + ", compo=" + compo + ", tamanho=" + tamanho + '}';
    }
    
    
    @Override
    public String copiar() {
        System.out.println("Colocar depois um prototype");
        return "Fez uma copia, que legal";
    }

    @Override
    public String mover(Estruturas e, String diretorio) {
        System.out.println("Moveu a estrutura para " + diretorio);
        return "Moveu a estrutura para " + diretorio;
    }
    
    public void add(Estruturas e){
        compo.add(e);
    }
    public void remover(Estruturas e){
        compo.remove(e);
    }

    @Override
    public Float getTamanho() {
        float tam=0;
        for(Estruturas i: compo){
            tam = tam + i.getTamanho();
        }
        System.out.println("Tamanho: " + tam);
        return tam;
    }
    
}
