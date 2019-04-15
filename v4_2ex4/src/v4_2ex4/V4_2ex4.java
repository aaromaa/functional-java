/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v4_2ex4;

import java.util.List;

/**
 *
 * @author aaro
 */
public class V4_2ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Omena> omenaLista = omenaStream.collect(   //tehdään omena lista käyttäen collect metodia
    ArrrayList::new, //ei anneta COllectoria vaan suoraan mitä Collector sisältäisi. Tässä T eli tyyppi
    List::add, //tässä akkumulaattori
    List::addAll); //tässä tässä redusointiprosessi
    }
    
}
