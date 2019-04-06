/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Palindromi;

/**
 *
 * @author aaro
 */
import java.util.Scanner;

public class testi {

    static Scanner lukija = new Scanner(System.in, "iso-8859-1");

    static String lueJaTarkasta() {
        System.out.println("Anna palindromi niin testaan onko se palindromi! ");

        String jono = lukija.nextLine();
        String vaarin = "vaarin";
        jono = jono.replaceAll(" ", "");
        for (int positio = 0; positio < jono.length(); positio++) {

            if (Character.isLetter(jono.charAt(positio)) == false) {
                System.out.println("ei käy kuin kirjaimet");
                break;
            }
        }

        String jono2 = jono.toLowerCase();
        return jono2;

    }

    static boolean onkoPalindromi(String mJono) {

        if (mJono.length() == 0) {
            return true;
        }
        for (int i = 0, j = mJono.length() - 1; i < j; i++, j--) {
            if (mJono.charAt(i) != mJono.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String aloitus = "k";
        String juttu2 = "vaarin";
        do {
            String juttu = lueJaTarkasta();
            if (juttu.equals(juttu2)) {
                System.out.println("pelkkiä kirjaimia kiitos");
                System.out.println("Jatketaanko k/e? ");
            } else {
                boolean onko = onkoPalindromi(juttu);
                if (onko == false) {
                    System.out.println(juttu + " ei ole palindromi!");
                } else {
                    System.out.println(juttu + "on palindromi!");
                }
                System.out.println("Jatketaanko k/e? ");

            }

        } while ("k".equals(lukija.nextLine()));
    }

}
