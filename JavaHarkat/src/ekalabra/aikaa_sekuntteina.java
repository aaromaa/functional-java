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
public class aikaa_sekuntteina {
    static Scanner lukija = new Scanner(System.in);
    static double sekunteina(int tunnit, int minuutit, int sekunnit){
        sekunnit = sekunnit+(3600*tunnit);
        sekunnit = sekunnit+(60*minuutit);
        return sekunnit;
    }
    public static void main(String[] args) {
        double tulos;
        int tunnit2;
        int minuutit2;
        int sekunnit2;
        
        tulos = sekunteina(1,1,1);
        System.out.println(tulos);
        System.out.println("anna tunnit: ");
        tunnit2 = lukija.nextInt();
        System.out.println("anna minat: ");
        minuutit2 = lukija.nextInt();
        System.out.println("anna sekunnit: ");
        sekunnit2 = lukija.nextInt();
        tulos = sekunteina(tunnit2, minuutit2, sekunnit2);
        System.out.println(tulos);
        
                
    }
    
}
