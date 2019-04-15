/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v4_2ex4;

/**
 *
 * @author aaro
 */
public class Omena{
    
    private String vari;
    private int paino;
    
    public Omena(String vari, int paino){
        this.vari = vari;
        this.paino = paino;
    }
    
    public int getPaino(){
        return paino;
    }
    
    public String getVari(){
        return vari;
    }
    
    
    public String toString(){
        return "Omena: " + vari + ":" + paino + " g";
    }
    
}
