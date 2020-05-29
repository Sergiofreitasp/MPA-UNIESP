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
public interface Visitor {
    public float visitMac(Macbook m);
    public float visitIphone(Iphone i);
}
