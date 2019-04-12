/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v3_2ex5;

import java.util.function.Function;
import java.util.*;
/**
 *
 * @author aaro
 */
public class Piste {
    int x,y;
    public Piste(int x,int y){
        this.x = x;
        this.y = y;
    }
    
    public Function makeSiirto(int x,int y){
        return function(){
        this.x = this.x +x;
        this.y = this.y +y;
        
    };
    }
}
