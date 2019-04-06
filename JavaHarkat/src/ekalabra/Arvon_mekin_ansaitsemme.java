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
public class Arvon_mekin_ansaitsemme {
    static Scanner lukija = new Scanner(System.in);
    public static void main(String[] args) {
        double eka;
        double toka;
        double kolmas;
        
        System.out.println("anna eka: ");
        eka = lukija.nextDouble();
        System.out.println("anna toka: ");
        toka = lukija.nextDouble();
        System.out.println("anna kolmas: ");
        kolmas = lukija.nextDouble();
        
        System.out.println("Summa on: " + (eka+toka+kolmas) + "\nTulo on: " + eka*toka*kolmas + "\nKeskiarvo on: " + (eka+toka+kolmas)/3.0);
        
               
        
    }
}
    