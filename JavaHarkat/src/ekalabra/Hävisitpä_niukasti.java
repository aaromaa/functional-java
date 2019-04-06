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
public class Hävisitpä_niukasti {
    static Scanner lukija = new Scanner(System.in);
    
    public static void main(String [] args) {
        double luku;
        double huijaus;
        System.out.print("Arvaa luku: ");
        luku = lukija.nextDouble();
        huijaus = luku+1;
        
        System.out.print("Minun lukuni on " + huijaus + " , hävisit niukasti.");
    } 
}
