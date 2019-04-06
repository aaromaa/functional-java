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
public class Koen_elämäni_tunteina {
    static Scanner lukija = new Scanner(System.in);
    static int aikaEro(int tun1, int min1, int sek1,int tun2, int min2, int sek2){
        int eka_aika;
        int toka_aika;
        int erotus;
        
        eka_aika = sekunteina(tun1, min1, sek1); 
        toka_aika = sekunteina(tun2, min2, sek2);
        erotus = eka_aika-toka_aika;
        
        return erotus;
    }
   
    static int sekunteina(int tunnit, int minuutit, int sekunnit){
        sekunnit = sekunnit+(3600*tunnit);
        sekunnit = sekunnit+(60*minuutit);
        return sekunnit;
    }
    public static void main(String[] args) {
        double tulos;
        int tunnit2;
        int minuutit2;
        int sekunnit2;
        int tunnit3;
        int minuutit3;
        int sekunnit3;
        
        
        
        System.out.println("anna tunnit: ");
        tunnit2 = lukija.nextInt();
        System.out.println("anna minat: ");
        minuutit2 = lukija.nextInt();
        System.out.println("anna sekunnit: ");
        sekunnit2 = lukija.nextInt();
        System.out.println("anna toisen ajan tunnit: ");
        tunnit3 = lukija.nextInt();
        System.out.println("anna toisen ajan minat: ");
        minuutit3 = lukija.nextInt();
        System.out.println("anna toisen ajan sekunnit: ");
        sekunnit3 = lukija.nextInt();
        tulos = aikaEro(tunnit2, minuutit2, sekunnit2, tunnit3, minuutit3, sekunnit3);
        System.out.println(tulos);
    }
}

        