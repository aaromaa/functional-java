/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pamama;

/**
 *
 * @author aaro
 */
import java.util.Scanner;

public class Tilitesti {

    static Scanner lukija = new Scanner(System.in);

    public static void main(String[] args) {

        Pankkitili pankkiolio = new Pankkitili();
        Pankkitili kauppias = new Pankkitili();
        Maksukortti korttiolio = new Maksukortti();
        Maksupääte pääteolio = new Maksupääte();
        korttiolio.setTili(pankkiolio);
        pääteolio.setMaksukortti(korttiolio);
        
        int mitä = 0;
                pankkiolio.pano(1000.00);
        korttiolio.setpin();
        

        do {
            System.out.println("1.) laita rahaa tilille ");
            System.out.println("2.) Nosta rahaa tililtä ");
            System.out.println("3.) Tulosta tilin saldo ");
            System.out.println("4.) Lopeta ");
            System.out.println("5.) Maksa ");
            System.out.println("6.) Maksa maksupäätteellä");
            mitä = lukija.nextInt();
            switch (mitä) {
                case 1:
                    System.out.println("Paljon haluat laittaa");
                    double panot = lukija.nextInt();
                    pankkiolio.pano(panot);
                    break;
                case 2:
                    System.out.println("paljon nostetaan");
                    double laitot = lukija.nextInt();
                    pankkiolio.otto(laitot);
                    break;
                case 3:
                    System.out.println("saldosi on : " + pankkiolio.getSaldo());
                    break;
                case 4:
                    break;
                case 5:

                    System.out.println("Paljon ostokset maksavat? ");
                    boolean apu = korttiolio.maksa(lukija.nextDouble());
                    if (apu = false) {
                        System.out.println("maksu epäonnistui!");
                    } else {
                        System.out.println("Maksu onnistui!");
                    }
                    System.out.println("Saldosi on: " + pankkiolio.getSaldo());
                    break;
                case 6:
                    pääteolio.otaMaksu();
                    break;
                            
                default:
                    System.out.println("Väärä painallus");

            }
        } while (mitä != 4);

    }

}
