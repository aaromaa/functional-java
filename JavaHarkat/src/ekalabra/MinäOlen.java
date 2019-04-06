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
public class MinäOlen {
    public static void main(String [] args) {
        String nimi;
        
        nimi = JOptionPane.showInputDialog("anna nimesi");
        JOptionPane.showMessageDialog(null, "Terve " + nimi);
        System.exit(0);
    }
}
