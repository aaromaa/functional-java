/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v3_1;

/**
 *
 * @author aaro
 */

public class V3_1 {

    /**
     * @param args the command line arguments
     */

    
    

    public static void main(String[] args) {
        // TODO code application logic here
    toCelsius celsius = fahrenheit -> {
        return (5f/9f) * (fahrenheit-32);
    };
    
    Area result = radius -> {
    return Math.PI * radius * radius;  
    };
    System.out.println(celsius.operation(100) + " " + result.operation(2));
    }
    interface toCelsius{
    float operation(float fahrenheit);
    }
    interface Area{
    double operation(int radius);   
    }
}
