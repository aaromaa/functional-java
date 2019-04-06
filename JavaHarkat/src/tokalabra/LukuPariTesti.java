/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokalabra;

/**
 *
 * @author aaro
 */
import java.util.Scanner;
public class LukuPariTesti {
    static Scanner lukija = new Scanner (System.in);
    public static void main(String[] args) {
        LukuPari ekaan;
        LukuPari tokaan;
        int Eka, Toka;
        
        System.out.println("anna eka: ");
        Eka = lukija.nextInt();
        System.out.println("anna toka");
        Toka = lukija.nextInt();
        
        ekaan = new LukuPari();
        ekaan.setEka(Eka);
        ekaan.setToka(Toka);
        
        tokaan = new LukuPari(1, 2);
        
        System.out.println("eka luku on: " + ekaan.getEka() + "toka luku on: " + ekaan.getToka() );
        System.out.println(ekaan);
        System.out.println(ekaan.suuruus());
        System.out.println("pienempi on: " + ekaan.pienempi());
        System.out.println(ekaan.jako());
    }
   
}

