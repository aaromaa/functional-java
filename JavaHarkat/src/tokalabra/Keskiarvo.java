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

public class Keskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        double luku;
        double lukuja = 0;
        int kerrat = 0;
        double keskiarvo;
        do {
            System.out.println("anna numero ");
            luku = lukija.nextInt();

            lukuja = (lukuja + luku);
            kerrat = (kerrat + 1);

        } while (luku != 0);
        keskiarvo = (lukuja / (kerrat - 1));
        if (lukuja == 0) {
            System.out.println("ei keskiarvoa");
        } else {
            System.out.println("keskiarvo on " + keskiarvo);
        }
    }
}
