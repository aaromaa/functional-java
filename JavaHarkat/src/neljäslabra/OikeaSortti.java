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
public class OikeaSortti {

    void sortti(int[] taulu, int i) {
        for (; i < taulu.length; i++) {
            for (int j = i + 1; j < taulu.length; j++) {

                if (taulu[i] > taulu[j]) {
                    int apu = 0;
                    apu = taulu[i];
                    taulu[i] = taulu[j];
                    taulu[j] = apu;

                }
            }
        }
    }
}
