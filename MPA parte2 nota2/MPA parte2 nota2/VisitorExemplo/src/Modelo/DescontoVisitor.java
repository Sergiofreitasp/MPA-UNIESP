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
public class DescontoVisitor implements Visitor{
    
    @Override
    public float visitMac(Macbook m) {
        float custo = m.getPreco();
        if(custo > 4000){
            float desconto = (float) (custo * 0.2);
            custo = custo - desconto;
        }else{
            custo = custo;
        }
        return custo;
    }

    @Override
    public float visitIphone(Iphone i) {
        float custo = i.getPreco();
        if(custo > 3699.90){
            custo = (float) (custo - 149.90);
        }else{
            custo = custo;
        }
        return custo;
    }
    
}
