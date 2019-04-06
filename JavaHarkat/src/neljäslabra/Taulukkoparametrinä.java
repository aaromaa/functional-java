/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neljäslabra;

/**
 *
 * @author aaro
 */
import java.util.Arrays;
import java.util.Random;

public class Taulukkoparametrinä {

    static void täytäTaulukko(int[] luvut) {
        for (int i = 0; i < luvut.length; i++) {
            luvut[i] = (int) (Math.random() * luvut.length);
        }
    }

    static void tulostaTaulukko(int[] luvut) {
        String sanat = Arrays.toString(luvut);
        System.out.println(sanat);
    }

    public static void main(String[] args) {
        int[] luvut = new int[5];
        int[] luvut2 = new int[2];
        täytäTaulukko((luvut));
        täytäTaulukko((luvut2));
        tulostaTaulukko(luvut);
        tulostaTaulukko(luvut2);
        
        Arrays.sort(luvut);
        Arrays.sort(luvut2);
        tulostaTaulukko(luvut);
        tulostaTaulukko(luvut2);
        OikeaSortti järkkä = new OikeaSortti();
        järkkä.sortti(luvut,0);
        tulostaTaulukko(luvut);
    }
}
