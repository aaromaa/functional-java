/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Salasana;

/**
 *
 * @author aaro
 */
import java.util.Date;

public class Salasanatietue {

    private String salasana;
    Date päiväys = new Date();

    

    public Salasanatietue() {

    }

    public Salasanatietue(String salasana) {
        this.salasana = salasana;
        päiväys = new Date();
        

    }
    public void setsalasana(String salkku){
        this.salasana = salkku;
        päiväys = new Date();
       
    }
    public String getsalasana(){
        return salasana;
    }
    public String getdate(){
                String apu = päiväys.toString();
        return apu;
    }
    public String satoString(){
        String apu = päiväys.toString();
        String apu2 = getsalasana();
        return (apu2);
    }
            

}
