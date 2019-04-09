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
import java.util.stream.IntStream;
public class V3_2ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] a = new int[20];
        int sum  = Arrays.stream(a)
                .map(x -> (int)((Math.random()*6) +1));
        
        IntStream stream = IntStream.of()
                
    }
    
}
