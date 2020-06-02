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
public class Individuo implements Participantes{
    private int membros;
    private String assento;
    private String id;
    private String nome;
    private boolean inst;


    public Individuo(String id, String nome) {
        this.membros = 1;
        this.assento = assentodisponivel();
        this.id = id;
        this.nome = nome;
        this.inst = false;
    }
    
    public static String assentodisponivel(){
        //Implementar algo para retornar um assento unico
        return "cadeira tal, fila tal";
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }

    public String getAssento() {
        return assento;
    }

    public void setAssento(String assento) {
        this.assento = assento;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isInst() {
        return false;
    }

    public void setInst(boolean inst) {
        this.inst = inst;
    }

    @Override
    public String toString() {
        return "Individuo{" + "membros=" + membros + ", assento=" + assento + ", id=" + id + ", nome=" + nome + ", inst=" + inst + '}';
    }
    

    
    
}
