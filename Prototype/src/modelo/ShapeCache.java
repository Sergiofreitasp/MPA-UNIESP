/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Usuario
 */
public class ShapeCache {
    private Map<String, Shape> cache = new HashMap<>();

    public ShapeCache() {
        
    }
    
    public ShapeCache(HashMap hm) {
        this.cache = hm;
    }
    public ShapeCache(ShapeCache target) {
        if(target != null){
            this.cache = target.cache;
        }
    }
    
    public ShapeCache clone() {
        return new ShapeCache(this);
    }
}
