/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class Macbook implements Produto{
    private String id;
    private String modelo;
    private float preco;

    public Macbook() {
    }

    public Macbook(String id, String modelo, float preco) {
        this.id = id;
        this.modelo = modelo;
        this.preco = preco;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public float accept(Visitor v) {
        return v.visitMac(this);
    }
    
    
}
