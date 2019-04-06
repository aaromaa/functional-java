/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekti;

/**
 *
 * @author aaro
 */
import java.util.Scanner;

public class Suoritus {

    static Scanner lukija = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Anna käyttäjänimesi: ");
        String tunnus = lukija.nextLine();

        System.out.println("Anna salasanasi käyttäjälle: " + tunnus);
        String salasana = lukija.nextLine();
        Käyttäjä käyttäjäolio = new Käyttäjä(tunnus, salasana);
        char halu = 99;
        int käyttäjähalu = 99;
        do {
            System.out.println("1. Käyttäjä\n2. Pelit\n3. Päiväkirja\n0. Lopeta");

            switch (halu) {
                case 1:

                    do {
                        System.out.println("1.Luo uusi käyttäjä\n2. Vaihda käyttäjää\n0.Edellinen");
                        käyttäjähalu = lukija.nextInt();
                        switch (käyttäjähalu) {

                            case 1:
                                System.out.println("Anna uuden käyttäjän käyttäjänimi: ");
                                String uusikäyttäjä = lukija.nextLine();
                                System.out.println("Anna sille vielä salasana: ");
                                String uusisalasana = lukija.nextLine();
                                Käyttäjä uusikäyttäjäolio = new Käyttäjä(uusikäyttäjä, uusisalasana);
                                break;
                            case 2:
                                System.out.println("Anna käyttäjätunnus johon haluat vaihtaa: ");
                                tunnus = lukija.nextLine();
                                System.out.println("Anna sen salasana: ");
                                salasana = lukija.nextLine();
                                
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Väärä painallus!");
                                break;
                        }
                       

                    } while (käyttäjähalu != 0);
                    
                    break;

                case 2:
                    System.out.println("Valitse peli");
                default:
                    break;

            }
        } while (halu != 0);
    }
}
