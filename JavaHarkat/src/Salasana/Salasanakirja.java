/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Salasana;

/**
 *
 * @author aaro
 */
import java.util.HashMap;
import java.util.Map;

public class Salasanakirja {

    private Salasanatietue joku;

    HashMap<String, Salasanatietue> hash = new HashMap();

    void lisääPari(String tunnus, String salasana) {
        Salasanatietue liitos = new Salasanatietue(salasana);
        hash.put(tunnus, liitos);
    }

    void tulosta() {
        for (Map.Entry<String, Salasanatietue> pari : hash.entrySet()) {
            System.out.println("Käyttäjätunnus: " + pari.getKey() + " Salasana: " + pari.getValue().satoString());
        }

    }

    String haeSalasana(String tunnus) {
        String tarkistus = hash.get(tunnus).satoString();
        return tarkistus;
    }

    boolean vaihdaSalasana(String tunnus, String salasana) {
        if ((hash.containsKey(tunnus)) == true) {
            Salasanatietue olio2 = new Salasanatietue(salasana);
            hash.replace(tunnus, olio2);
            return true;
        } else {
            return false;
        }
    }

    boolean poistaPari(String tunnus, String salasana) {
        if ((hash.containsKey(tunnus)) == true && hash.get(tunnus).satoString().equals(salasana)) {
            hash.remove(tunnus, hash.get(tunnus));
            return true;
        } else {
            return false;
        }

    }

    void tyhjennä() {
        hash.clear();
    }
}
