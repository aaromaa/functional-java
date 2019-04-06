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
import java.util.Scanner;
public class Hypotenuusa {
    static Scanner lukija = new Scanner(System.in);
    public static void main(String[] args) {
        double eka;
        double toka;
        double tulos;
               
        System.out.println("anna eka: ");
        eka = lukija.nextDouble();
        System.out.println("anna toka: ");
        toka = lukija.nextDouble();
        tulos = Math.sqrt((eka*eka)+(toka*toka));
        System.out.println("tulos on: " + tulos);
        
    }
    
}
