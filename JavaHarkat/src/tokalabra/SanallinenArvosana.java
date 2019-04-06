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

public class SanallinenArvosana {

    static Scanner lukija = new Scanner(System.in);

    public static void main(String[] args) {
        int arvosana;
        do {
            System.out.println("Anna arvosana 0-5 ");
            arvosana = lukija.nextInt();
            muuntaja(arvosana);
        } while (arvosana >= 0 & arvosana <= 5);

    }

    public static void muuntaja(int jokin) {
        int arvosana = jokin;
        switch (arvosana) {
            case 0:
                System.out.println("Arvosana: hylätty");
                break;
            case 1:
                System.out.println("Arvosana: tyydyttävä");
                break;
            case 2:
                System.out.println("Arvosana: erittäin tyydyttävä");
                break;
            case 3:
                System.out.println("Arvosana: hyvä");
                break;
            case 4:
                System.out.println("Arvosana: erittäin hyvä");
                break;
            case 5:
                System.out.println("Arvosana: kiitettävä");
                break;
            default:
                System.out.println("Arvosana ei välillä 0-5.");

        }
    }
}
