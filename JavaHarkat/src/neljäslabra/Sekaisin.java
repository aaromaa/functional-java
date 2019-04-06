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
public class Sekaisin {

    static void etsiPienimmänIndeksi(int[] taulu, int i) {
        for (; i < taulu.length; i++) {
            for (int j = i + 1; j < taulu.length; j++) {

                if (taulu[i] > taulu[j]) {
                    vaihda(taulu,i,j);
                
                }
                }
        }
            
        }




    static void vaihda(int[] taulu, int i, int j) {
                int apu = 0;
        apu = taulu[i];
        taulu[i] = taulu[j];
        taulu[j] = apu;

    }

    static void järjestäTaulukko(int[] luvut) {
        for (int i = 0; i < luvut.length; i++) {
            minInd = etsiPienimmänIndeksi(taulu, i);
            vaihda(taulu, i, minInd);
        }

    }

}
