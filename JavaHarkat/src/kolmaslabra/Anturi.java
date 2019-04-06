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
public class Anturi {
    private int Max = 30;
    private int Min = 10;
    private double Arvo;
    private Mittari Toka;
    private Mittari Kolmas;
    
    
   
    
    
     public Anturi(){
         
      
    }
       
       
               
    
        public void Anturi(int Min, int Max){
        this.Min = Min;
        this.Max = Max;
        
  }
        
        
   
      
    public double getLämpötila() {
        Arvo = Math.random();
        Arvo = ((Arvo*(Max-Min))+Min);
        return Arvo;
    }
 
    

    public void setMin(int minimi){
        Min = minimi;
        
        
    }
    public void setMax(int Maximi) {
        Max = Maximi;
        
    }
   

}

