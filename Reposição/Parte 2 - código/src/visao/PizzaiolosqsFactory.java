/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

/**
 *
 * @author Usuario
 */
public class PizzaiolosqsFactory extends PizzariaFactory{

    @Override
    public Pizza makePizza() {
        return new PizzaSQS();
    }

    @Override
    public Calzone makeCalzone() {
        return new CalzoneSQS();
    }
    
}
