/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v3_2ex3;

/**
 *
 * @author aaro
 */
import java.util. *;
import java.util.function.IntSupplier;
import java.util.stream.IntStream;
public class V3_2ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IntStream.generate(() -> (int)(Math.random()*32+1)).limit(7).forEach((n) -> System.out.println(n));     
        System.out.println("\n");
        IntSupplier supp = new IntSupplier() {
            @Override
            public int getAsInt() {
                return (int)(Math.random()*32+1);
            }
        };
        IntStream.generate(supp).limit(7).forEach((n) -> System.out.println(n));     
        
    }
    
}
