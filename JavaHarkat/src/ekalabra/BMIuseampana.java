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


public class BMIuseampana {
    static Scanner lukija = new Scanner(System.in);
    private static double annaPituus(){
        double pituus;

        System.out.println("Anna pituutesi sentteinä: ");
        pituus = lukija.nextDouble();
        pituus = pituus/100;
        return pituus;
    }
    private static int annaPaino(){
        int paino;
        System.out.println("Anna painosi kiloina");
        paino = lukija.nextInt();
        return paino;
    }
    public static double laskeIndeksi(double pituus,int paino){
        double IBM;
        pituus = pituus*pituus;
        IBM = paino/pituus;
        return IBM; 
    }
    private static String sana(double IBM){
       if (IBM<18.5){
           return "Normaalia alhaisempi paino";}
           else if (IBM>=18.5 & IBM<25){
           return "Normaali paino";
       }
           else if (IBM>=25 & IBM<30) {
               return "Lievä ylipaino";
           }
           else if (IBM>=30 & IBM<35){
               return "Merkittävä ylipaino";
               
           }
           else if (IBM>=35 & IBM<40){
               return "Vaikea Ylipaino";
           }
           else return "Sairaalloinen Ylipaino";
       
        
    }
    public static void main(String[] args) {
        double pituus = annaPituus();
        int paino = annaPaino();
        double IBM = laskeIndeksi(pituus,paino);
        String sanallinen = sana(IBM);
        System.out.println("Painoindeksi on: " + IBM);
        System.out.println("Indeksisi merkitsee, että sinulla on " + sanallinen);
    }
}
