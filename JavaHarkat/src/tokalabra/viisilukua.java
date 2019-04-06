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

public class viisilukua {

    static Scanner lukija = new Scanner(System.in);

    public static int lueJaTarkasta() {
        int luku;
        do {
            System.out.println("anna kokonaisluku");
            luku = lukija.nextInt();
            if (luku <= 0) {
                System.out.println("annoit väärän luvun");
            }

        } while (luku <= 0);
        return luku;
    }

    public static void main(String[] args) {
        int summa = 0;

        for (int i = 1; i <= 5; i++) {
            int luku = lueJaTarkasta();
            summa = summa + luku;

        }
        System.out.println(summa);
    }
}
