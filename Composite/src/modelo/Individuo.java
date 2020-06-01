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


    public Individuo(String id, String nome) {
        this.membros = 1;
        this.assento = assentodisponivel();
        this.id = id;
        this.nome = nome;
    }
    
    public static String assentodisponivel(){
        //Implementar algo para retornar um assento unico
        return "cadeira tal, fila tal";
    }

    @Override
    public int totalParticipantes() {
        return 1;
    }

    @Override
    public int totalAssentos() {
        return 1;
    }

    @Override
    public String toString() {
        return "Individuo{" + "membros=" + membros + ", assento=" + assento + ", id=" + id + ", nome=" + nome + '}';
    }
    
    
}
