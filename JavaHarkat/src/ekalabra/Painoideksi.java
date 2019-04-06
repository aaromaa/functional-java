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

public class Painoideksi {
    static Scanner lukija = new Scanner(System.in);
    public static void main(String [] args) {
       Double paino;
       Double pituus;
       
       System.out.println("Anna pituutesi metreinä: ");
       pituus = lukija.nextDouble();
       pituus = pituus*pituus;
       System.out.println("Anna painosi kiloina");
       paino = lukija.nextDouble();
       
        System.out.println("Painoindeksi on: " + paino/pituus);
               
       
    }
    }
