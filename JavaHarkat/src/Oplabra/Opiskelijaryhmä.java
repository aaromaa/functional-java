/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oplabra;

/**
 *
 * @author aaro
 */
import java.util.Arrays;

public class Opiskelijaryhmä {

    private String tunnus;
    private Opiskelija yhteys;

    public void settunnus(String tunnus) {
        this.tunnus = tunnus;
    }

    public void setyhteys(Opiskelija yhteys) {
        this.yhteys = yhteys;
    }

    public String gettunnus() {
        return tunnus;

    }

    public Opiskelija getyhteys() {
        return yhteys;
    }

    public Opiskelijaryhmä(String tunnus, Opiskelija olio) {
        this.tunnus = tunnus;
        this.yhteys = olio;

    }

    public Opiskelijaryhmä() {

    }
    Opiskelija[] taulukko = new Opiskelija[0];

    public void lisää(Opiskelija op) {
        taulukko = Arrays.copyOf(taulukko, (taulukko.length + 1));
        System.out.println(taulukko.length);
        taulukko[(taulukko.length - 1)] = op;
    }

    public void tulosta() {
        System.out.println("tunnus on: " + tunnus + "\nyhteyshenkilö on: " + yhteys.optoString() + "\nOpiskelijoita ovat: ");
        for (Opiskelija i : taulukko) {
            System.out.println(i.optoString());
        }
            
        }
        
        
        
    
}
