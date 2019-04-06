/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ekalabra;

/**
 *
 * @author aaro
 */
public class random1 {
    public static void main(String[] args) {
        double eka;
        double toka;
        double tulos;
        eka = Math.random();
        eka = eka*90+10;
        toka = Math.random();
        toka = toka*90+10;
        tulos = Math.sqrt((eka*eka)+(toka*toka));
        System.out.println("tulos on: " + tulos);
    }
}
        