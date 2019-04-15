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
public class LaktoositonTehdas extends AbstractTuotaFactory{
    
    public LaktoositonTehdas() {
        map.put("MAITO", Maitolaktoositon::new);
        map.put("JUUSTO", Juustolaktoositon::new);
                map.put("JUGURTTI", Jugurttilaktoositon::new);

    }   
}
