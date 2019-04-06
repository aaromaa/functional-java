/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ekalabra;

/**
 *
 * @author aaro
 */
import java.util.Random;
public class Random2 {
    public static void main(String[] args) {
        Double eka;
        Double toka;
        Double tulos;
        Random apua = new Random();
        eka = apua.nextDouble();
        eka = eka*90+10;
        
        toka = apua.nextDouble();
        toka = toka*90+10;
        tulos = Math.sqrt((eka*eka)+(toka*toka));
        System.out.println("tulos on: " + tulos);
    }
}
