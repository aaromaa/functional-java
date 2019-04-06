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
public class Sirkus {
     static Scanner lukija = new Scanner(System.in);
    
         

    public static void main(String[] args) {
        int kuka;
        int mies = 0;
        int nainen = 0;
        int lapsi = 0;
        int rahat;
        do {
            System.out.println("seuraava? ");
            kuka = lukija.nextInt();
            switch (kuka){
                case 1 :
                    mies = mies+1;
                    break;
                case 2 :
                    nainen= nainen+1;
                    break;
                case 3 :
                    lapsi = lapsi+1;
                    break;
                case 0:
                    break;
                default : 
                    System.out.println("väärä näppäin ");
            }
        } while(kuka!=0);
       rahat = ((mies+nainen)*24+(lapsi*12));
        System.out.println("miehiä: " + mies + " naisia: " + nainen + " lapsia: " + lapsi + " rahoja: " + rahat);
    }
}