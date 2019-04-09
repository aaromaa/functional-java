/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v3_2ex1;

/**
 *
 * @author aaro
 */
import java.util.*;
import java.util.function.IntSupplier;

public class V3_2ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IntSupplier  generator = () -> (int)(Math.random()*6+1);
        Tulostaja t = new Tulostaja();
        
        t.tulosta(generator);
    }
    
}