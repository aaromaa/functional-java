/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokalabra;

import java.util.Scanner;

/**
 *
 * @author aaro
 */
public class paposu {
    
    private static int summa(int luku) {
        int summa = 0;
        if (luku < 0) {
            return -99;
        }
        for (int i = luku; i > 0; i--) {
            if ((i % 2) == 0) {
                summa += i;
            }
        }
        return summa;
    }
    
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int luku, kokonaisluku = 1;
        System.out.println("Ohjelma laskee syötelukua pienempien parillisten positiivisten lukujen summan.");
        while (kokonaisluku != 0) {
            System.out.print("Anna luku: ");
            kokonaisluku = lukija.nextInt();
            luku = summa(kokonaisluku);
            if (luku == -99) {
                System.out.println("Luku " + kokonaisluku + " on negatiivinen, sitä pienempiä positiivisia lukuja ei ole.)");
            } else if (luku != 0) {
                System.out.println("Lukua " + kokonaisluku + " pienempien parillisten positiivisten lukujen summa on " + luku);
            }
        }
        System.out.println("Ohjelman suoritus pää5ttyi.");
    }
    
}
