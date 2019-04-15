/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v4_2ex5;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

/**
 *
 * @author aaro
 */
public class AbstractTuotaFactory {
    
    Map<String, Supplier<Tuote>> map; 
   
    public AbstractTuotaFactory(){
        map = new HashMap<>();
    }   
        
    public Tuote getTuote(String tuotetyyppi){
     Supplier<Tuote> tuote = map.get(tuotetyyppi.toUpperCase());
     if(tuote != null) {
       return tuote.get();
     }
     throw new IllegalArgumentException("No such shape " + tuotetyyppi.toUpperCase());
  }
}