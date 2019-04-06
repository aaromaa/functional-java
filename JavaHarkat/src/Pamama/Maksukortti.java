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

public class Maksukortti {

    private Pankkitili tili;
    static Scanner lukija = new Scanner(System.in);
    private int pin;

    public Maksukortti() {
        pin = 1234;

    }

    boolean maksa(double summa) {
        double apu;

        apu = tili.otto(summa);
        if (summa < 0) {
            return false;

        } else {
            if (apu <= 0.0) {
                return false;
            } else {
                return true;
            }

        }

    }

    public void setTili(Pankkitili joku) {
        tili = joku;
    }

    public boolean setpin() {
        int vanha;
        int uusi;

        System.out.println("anna vanha pin");
        vanha = lukija.nextInt();
        if (vanha != pin) {
            System.out.println("väärä koodi");
            return false;

        }
        System.out.println("anna uusi pin kahdesti ");
        uusi = lukija.nextInt();
        System.out.println("anna viekö toisen kerran ");
        vanha = lukija.nextInt();
        if (uusi != vanha) {
            return false;
        } else {
            pin = uusi;
            return true;
        }

    }

    public int getpin() {
        return pin;
    }

}
