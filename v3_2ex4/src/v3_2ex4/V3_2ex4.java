/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v3_2ex4;

/**
 *
 * @author aaro
 */
import java.util.function.IntSupplier;
import java.util.stream.IntStream;
public class V3_2ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        IntSupplier supp = new IntSupplier() {
            int ret = 0;
            int befo = 1;
            int curr = ret + befo;
            @Override
            public int getAsInt() {
                
                curr = ret + befo;
                ret = befo;
                befo = curr;
                return ret;
            }
        };
        
        IntStream.generate(supp).limit(10).forEach((n) -> System.out.println(n));
    }
    
}
