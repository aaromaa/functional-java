/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v3_2ex2;

/**
 *
 * @author aaro
 */


    /**
     * @param args the command line arguments
     */
import java.util.function.DoubleUnaryOperator;

public class V3_2ex2 {

    static DoubleUnaryOperator makePistelaskuri(double kPiste, double lisapisteet){
            return (T) ->
             (60 + ((T - kPiste)*2))
                    
            ;
    };
        
    public static void main(String[] args) {

       
       DoubleUnaryOperator normaaliLahti = makePistelaskuri(90, 2.0);
       
       System.out.println(normaaliLahti.applyAsDouble(100)); 
          
    }
    
}
