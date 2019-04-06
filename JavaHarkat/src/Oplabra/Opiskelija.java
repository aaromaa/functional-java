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
public class Opiskelija {

    private String opnumero;
    private String etunimi;
    private String sukunimi;

    public void setopnumero(String numero) {
        this.opnumero = numero;
    }

    public void setetunimi(String etunimi) {
        this.etunimi = etunimi;
    }

    public void setsukunimi(String sukunimi) {
        this.sukunimi = sukunimi;
    }

    public String getopnumero() {
        return opnumero;
    }

    public String getetunimi() {
        return etunimi;
    }

    public String getsukunimi() {
        return sukunimi;

    }

    public String optoString() {
        return (opnumero + " " + etunimi + " " + sukunimi);
    }

    public Opiskelija(String numero, String etunimi, String sukunimi) {
        this.opnumero = numero;
        this.etunimi = etunimi;
        this.sukunimi = sukunimi;

    }

public Opiskelija(){
        this("000000", "Ei Etunimeä", "Ei Sukunimeä");
    }

}
