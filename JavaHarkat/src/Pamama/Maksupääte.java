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

public class Maksupääte {

    static Scanner lukija = new Scanner(System.in);

    Pankkitili kauppiaantili = new Pankkitili();

    private Maksukortti tili2;
    private Pankkitili kauppias;

    public Maksupääte() {

    }

    public void setKauppias(Pankkitili tili) {
        kauppias = tili;
    }

    public void setMaksukortti(Maksukortti joku2) {
        tili2 = joku2;
    }

    public void otaMaksu() {
        int tsekki = 0;
        int yritys = 1;
        int PIN = tili2.getpin();
        System.out.println("Paljon veloitetaan? ");
        double määrä = lukija.nextDouble();

        for (int i = 3; i > 0; i--) {
            System.out.println("anna pin!");
            tsekki = lukija.nextInt();
            if (tsekki == PIN) {
                break;
                
            }
                System.out.println("väärä PIN! ");
                if (i == 1) {
                    System.out.println("väärä pin kolmatta ekrtaa maksu peruttu! ");
                    break;
                }

            
        }
        lukija.nextLine();
        boolean tulos = tili2.maksa(määrä);
        if (tulos == true) {

            kauppiaantili.pano(määrä);
        }
    }
}
