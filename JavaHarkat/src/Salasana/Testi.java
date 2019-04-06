/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Salasana;

/**
 *
 * @author aaro
 */
import java.util.Scanner;

public class Testi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Salasanatietue tietue = new Salasanatietue();
        Salasanatietue tietue2 = new Salasanatietue("salasana");
        Salasanakirja kirja = new Salasanakirja();
        String jotain = (tietue2.satoString() + " " + tietue2.getdate());
        System.out.println(jotain);
                
                

        int halu = 999;

        do {
            System.out.println("\n0. Lopeta\n1. Lisää tunnus/salasana -pari\n2. Tulosta kaikki tunnus/salasana -parit\n3. Muuta tunnuksen salasana\n4. Poista tunnus/salasana -pari\n5. Poista kaikki tunnus/salasana -parit");
            halu = lukija.nextInt();
            switch (halu) {
                case 1:
                    String tunnus;
                    String salasana;
                    System.out.println("Anna käyttäjätunnus: ");
                    String tunnus5 = lukija.next();
                    if (kirja.hash.containsKey(tunnus5)==true){
                        System.out.println("Käyttäjätunuus on jo olemassa");
                        break;
                    }
                    System.out.println("Anna salasana: ");
                    String salasana5 = lukija.next();
                    kirja.lisääPari(tunnus5, salasana5);
                    break;
                case 2:
                    kirja.tulosta();
                    break;

                case 0:
                    break;

                case 3:
                    System.out.println("Anna tunnus: ");
                    String tunnus2 = lukija.next();
                    System.out.println("Anna uusi salasana: ");
                    String salasana2 = lukija.next();
                    boolean meniks = kirja.vaihdaSalasana(tunnus2, salasana2);
                    System.out.println(meniks);
                    break;
                case 4:
                    System.out.println("Anna käyttäjätunnus parista, jonka haluast poistaa: ");
                    String poistot = lukija.next();
                    System.out.println("Anna sen salasana: ");
                    String poistos = lukija.next();
                    boolean meniks2 = kirja.poistaPari(poistot, poistos);
                    System.out.println(meniks2);
                    break;
                case 5:
                    kirja.tyhjennä();
                    break;
                default:
                    System.out.println("Antamasi komento on väärä! ");
                    break;

            }
        } while (halu != 0);
    }
}
