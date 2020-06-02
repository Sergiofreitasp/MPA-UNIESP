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
public class Arquivos implements Estruturas{
    private String nome;
    private Float tamanho;

    public Arquivos(String nome, Float tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getTamanho() {
        return tamanho;
    }

    public void setTamanho(Float tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Arquivos{" + "nome=" + nome + ", tamanho=" + tamanho + '}';
    }
    
    

    @Override
    public String copiar() {
        System.out.println("Colocar depois um prototype");
        return "Fez uma copia, que legal!";
    }

    @Override
    public String mover(Estruturas e, String diretorio) {
        System.out.println("Moveu a estrutura para " + diretorio);
        return "Moveu a estrutura para " + diretorio;
    }

    
    
    
}
