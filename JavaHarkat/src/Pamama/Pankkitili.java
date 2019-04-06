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
public class Pankkitili {

    private double Saldo = 0;

    public double getSaldo() {
        return Saldo;
    }

    public double otto(double määrä) {
        if (määrä < 0) {
            return 0.0;
        }

        if (Saldo < määrä) {

            return 0.0;
        }
        Saldo = (Saldo - määrä);
        return määrä;

    }

    public void pano(double määrä) {
        if (määrä < 0) {
            System.out.println("ei voi laittaa negatiivista");

        } else {
            Saldo = Saldo + määrä;

        }

    }
}
