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
public class LukuPari {

    private int eka;
    private int toka;

    public LukuPari(int eka, int toka) {
        this.eka = eka;
        this.toka = toka;

    }

    public LukuPari() {

    }

    public void setEka(int uusiEka) {
        eka = uusiEka;
    }

    public void setToka(int uusiToka) {
        toka = uusiToka;

    }

    public int getEka() {
        return eka;
    }

    public int getToka() {
        return toka;
    }

    public String toString() {
        String streka, strtoka;
        streka = Integer.toString(this.eka);
        strtoka = Integer.toString(this.toka);
        return "luku1 on : " + streka + "toka luku on: " + strtoka;
    }

    public String suuruus() {
        if (eka == toka) {
            return "luvut ovat yhtä suuret";
        } else if (eka > toka) {
            return "eka o suurempi ku toka";
        } else {
            return "toka o suurempi ku eka";
        }
    }

    public int pienempi() {
        if (eka == toka) {
            return eka;
        } else if (toka < eka) {
            return toka;
        } else {
            return eka;
        }
    }

    public boolean jako() {
        if (toka == 0) {
            return false;
        } else if ((eka % toka) == 0) {
            return true;
        } else {
            return false;
        }
    }

}
