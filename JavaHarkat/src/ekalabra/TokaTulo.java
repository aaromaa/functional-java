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
import javax.swing.*;
public class TokaTulo {
    public static void main(String [] args) {
        String numeroJono;
        int eka;
        double toka;
        String tulos;
        
        numeroJono = JOptionPane.showInputDialog("anna kokonaisluku");
        eka = Integer.parseInt (numeroJono);
        numeroJono = JOptionPane.showInputDialog("anna liukuluku");
        toka = Double.parseDouble(numeroJono);
        JOptionPane.showMessageDialog(null, "Tulo = " + eka*toka);
        System.exit(0);
      
             }
    
}
