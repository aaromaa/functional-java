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
public class Vaihtelu_virkistää {
    static Scanner lukija = new Scanner(System.in);
    public static void main(String[] args) {
       int eka;
       int toka;
       int apu;
        System.out.println("anna eka: ");
        eka = lukija.nextInt();
        System.out.println("anna toka: ");    
        toka = lukija.nextInt();
        System.out.println("eka = " + eka + ", toka = " + toka);
        apu = eka;
        eka = toka;
        toka = apu;
        System.out.println("eka = " + eka + ", toka = " + toka);
                
               
    }
}
