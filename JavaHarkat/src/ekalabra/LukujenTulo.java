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
public class LukujenTulo {
    static Scanner lukija = new Scanner(System.in);
    public static void main(String[] args) {
        int ensimmäinen;
        double toinen;
        
        System.out.print("Anna kokonaisluku: ");
        ensimmäinen = lukija.nextInt();
        System.out.print("Anna liukuluku: ");
        toinen = lukija.nextDouble();
        System.out.println("Lukujen tulo ="+ ensimmäinen*toinen);
    }
  
    
}
