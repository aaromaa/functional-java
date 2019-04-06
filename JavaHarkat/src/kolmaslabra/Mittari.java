/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolmaslabra;

/**
 *
 * @author aaro
 */
public class Mittari {
    private Anturi Uus;
    
    public Mittari(Anturi Uus){
    this.Uus = Uus;
    
    }
            
    void näytä(){
        System.out.println(Uus.getLämpötila());
    }
    
}
