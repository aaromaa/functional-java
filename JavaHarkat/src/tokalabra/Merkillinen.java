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
public class Merkillinen {
    private char merkki = '*';
    
    public Merkillinen() {
    }
    
    public Merkillinen(char x) {
        this.merkki = x;
    }
    
    public void setChar(char x) {
        this.merkki = x;
    }
    
    public void teeRivi(int pituus) {
        if (pituus > 0) {
            for (int i = pituus; i > 0; i--) {
                System.out.print(this.merkki);
            }
            System.out.println();
        } else {
            System.out.println("Pituuden pitää olla isompi kuin 1.");
        }
    }
    
    public void teeNeliö(int korkeus, int leveys) {
        if (korkeus > 0 && leveys > 0) {
            for (int i = korkeus; i > 0; i--) {
                teeRivi(leveys);
            }
        } else {
            System.out.println("Pitää olla vähintään 1.");
        }
    }
    
    public void teeKolmio(int korkeus) {
        int määrä = 1;
        for (int i = korkeus; i > 0; i--) {
            teeRivi(määrä);
            määrä++;
        }
    }
}
