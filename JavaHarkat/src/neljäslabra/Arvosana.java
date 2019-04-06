/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neljäslabra;

/**
 *
 * @author aaro
 */
import java.util.Scanner;

public class Arvosana {

    static Scanner lukija = new Scanner(System.in);

    public static void main(String[] args) {
        int[] numerot = new int[6];
        int apu = 0;
        int numero = 0;    
        do {
            System.out.println("anna numero 0-5! Negatiivinen tai yli 5 lopettaa kyselyn. ");
            numero = lukija.nextInt();
            if (numero >= 0 && numero <= 5) {
                numerot[numero] = numerot[numero]+1;

            
               
            }
        } while (numero >= 0 && numero <= 5);
        for (int i = 0; i < numerot.length; i++) {
            System.out.print("\n" +  i + ". " + numerot[i] + "\n");
            for (int j = 0; j<numerot[i]; j++){
                System.out.print("*");
            }
        }
    }
}
