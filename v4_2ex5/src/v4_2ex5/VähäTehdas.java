/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v4_2ex5;

/**
 *
 * @author aaro
 */
public class VähäTehdas extends AbstractTuotaFactory{
    
    public VähäTehdas() {
        map.put("MAITO", Maitovähä::new);
        map.put("JUUSTO", Juustovähä::new);
        map.put("JUGURTTI", Jugurttivähä::new);
    }   
}

