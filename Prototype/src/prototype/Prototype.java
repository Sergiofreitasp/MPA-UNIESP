/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

import java.util.HashMap;
import java.util.Map;
import modelo.Circle;
import modelo.Retangulo;
import modelo.Shape;
import modelo.ShapeCache;
import modelo.Square;

/**
 *
 * @author Usuario
 */
public class Prototype {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Circle c1 = new Circle("dfskaf", "CIRCULO");
        Retangulo r1 = new Retangulo("dfskaf", "RETANGULO");
        Square q1 = new Square("dfskaf", "quadrado");
        
        Map<String, Shape> cache = new HashMap<>();
        cache.put("circulo", c1);
        cache.put("retangulo", r1);
        cache.put("quadrado", q1);
        
        ShapeCache sc = new ShapeCache((HashMap) cache);
        sc.clone();
    }
    
    
}
