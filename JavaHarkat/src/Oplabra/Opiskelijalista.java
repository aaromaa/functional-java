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

import java.util.ArrayList;
public class Opiskelijalista {
    private String tunnus;
    private Opiskelija yhteys;
    private Opiskelija joku;

    
    public void settunnus(String tunnus){
        this.tunnus = tunnus;
    }
    public void setyhteys(Opiskelija yhteys){
        this.yhteys = yhteys;
    }
    public String gettunnus(){
        return tunnus;
    }
    public Opiskelija getyhteys(){
        return yhteys;
    }
    
    public Opiskelijalista (String tunnus, Opiskelija yhteys){
       this.tunnus = tunnus;
       this.yhteys = yhteys;

    }
    public Opiskelijalista(){
        
    }

   public ArrayList<Opiskelija> opiskelijat = new ArrayList();
        
    
    public void lisää(Opiskelija op){
        opiskelijat.add(op);
    
    }
    public void tulosta(){
        for (Opiskelija sdasd : opiskelijat )
        System.out.println(sdasd.optoString());
        
    }
    }

