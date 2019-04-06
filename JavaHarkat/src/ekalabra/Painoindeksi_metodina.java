/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ekalabra;

import java.util.Scanner;

/**
 *
 * @author aaro
 */
public class Painoindeksi_metodina {

    private static void laskeBMI() {

        Scanner lukija = new Scanner(System.in);

        double paino;
        double pituus;

        System.out.println("Anna pituutesi metreinä: ");
        pituus = lukija.nextDouble();
        pituus = pituus * pituus;
        System.out.println("Anna painosi kiloina");
        paino = lukija.nextDouble();

        System.out.println("Painoindeksi on: " + paino / pituus);
    }

    public static void main(String[] args) {
        laskeBMI();
    }
}
