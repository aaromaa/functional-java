/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v3_2ex5;

/**
 *
 * @author aaro
 */


import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Function;

public class V3_2ex5 {
          
    public static void main(String[] args) {
               
       Function siirto = Piste.makeSiirto(1, 2);
       Function skaalaus = Piste.makeSkaalaus(2);
       Function kierto = Piste.makeKierto(Math.PI);
       Function muunnos = // muodosta tässä yhdistetty funktio
       
       Piste[] pisteet = {new Piste(1,1), new Piste(2,2), new Piste(3,3)};
       List<Piste> uudetPisteet = new CopyOnWriteArrayList();
       
       for (Piste p: pisteet){
           uudetPisteet.add((Piste)muunnos.apply(p));
       } 
  
       uudetPisteet.forEach(p -> System.out.println(p));
    }
}