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
public abstract class Jogo {
    private int idJogo;
    private String nome;
    private int quantidadeJogos;
    private float precoAuguel;
    private int quantidadePessoas;

    public int getIdJogo() {
        return idJogo;
    }

    public void setIdJogo(int idJogo) {
        this.idJogo = idJogo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeJogos() {
        return quantidadeJogos;
    }

    public void setQuantidadeJogos(int quantidadeJogos) {
        this.quantidadeJogos = quantidadeJogos;
    }

    public float getPrecoAuguel() {
        return precoAuguel;
    }

    public void setPrecoAuguel(float precoAuguel) {
        this.precoAuguel = precoAuguel;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public void setQuantidadePessoas(int quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }

    @Override
    public String toString() {
        return "Jogo{" + "idJogo=" + idJogo + ", nome=" + nome + ", quantidadeJogos=" + quantidadeJogos + ", precoAuguel=" + precoAuguel + ", quantidadePessoas=" + quantidadePessoas + '}';
    }
    
    public abstract void calcularTotal();
}
