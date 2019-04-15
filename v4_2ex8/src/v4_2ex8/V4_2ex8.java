/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v4_2ex8;

/**
 *
 * @author aaro
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;
public class V4_2ex8 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
     
        Subject s1 = new Subject();
        //Subject s2 = new Subject();
                
        List<String> hs = new ArrayList<>(); 
        List<String> il = new ArrayList<>(); 
        
        s1.addObserver((Observable o, Object arg) -> {
            if ((Boolean)arg.contains("politiikka")) hs.add((String)arg);
        });
        
        s1.addObserver((Observable o, Object arg) -> {
            if ((Boolean)arg.contains("julkkis")) il.add((String)arg);
        });
        
        Thread t1 = new Thread(s1);
        t1.start();
        //Thread t2 = new Thread(s2);
        //t2.start();
           
        try {
            t1.join();
          //  t2.join();
        } catch (InterruptedException ex) {
        }
        
        hs.forEach (System.out::println);
        il.forEach (System.out::println);
        
    }
    
}