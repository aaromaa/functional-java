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
public class MerkillinenTesti {
   public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        String halu;
        String merkki;
        int pituus, korkeus, leveys;
        Merkillinen joku = new Merkillinen();
        do {
            System.out.println("\na: rivi\nb: neliö\nc: kolmio\nl: lopetus");
            halu = lukija.next();
            switch (halu) {
                case "a":
                    System.out.print("\nAnna rivin pituus: ");
                    pituus = lukija.nextInt();
                    joku.teeRivi(pituus);
                    break;
                case "b":
                    System.out.print("\nAnna korkeus: ");
                    korkeus = lukija.nextInt();
                    System.out.print("Anna leveys: ");
                    leveys = lukija.nextInt();
                    joku.teeNeliö(korkeus, leveys);
                    break;
                case "c":
                    System.out.print("\nAnna korkeus: ");
                    korkeus = lukija.nextInt();
                    joku.teeKolmio(korkeus);
                    break;
                case "l":
                    System.out.println("\nOhjelma Loppu.");
                    continue;
                default:
                    System.out.println("\nVirheellinen merkki.");
            }
        } while (!(halu.equals("l")));
    }
}
