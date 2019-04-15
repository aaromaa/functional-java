/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v4_2ex6;

import java.util.function.Function;
import java.util.function.UnaryOperator;

/**
 *
 * @author aaro
 */
public class V4_2ex6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String testString = "StrinÖg    dsÄfm  sturct äsdåf sdföf f ";
        UnaryOperator<String> välilyönnit =
                (String s) -> 
                    {   StringBuilder build = new StringBuilder(s);
                        int i;
                        for(i = 1;i< s.length();i++){
                            if( s.charAt(i) == ' ' && s.charAt(i-1) == ' '){
                                
                                s = build.deleteCharAt(i-1).toString();
                                i--;
                            }
                        }
                        return s;
                    };
        UnaryOperator<String> scandit =
                (String s) -> 
                    {   StringBuilder build = new StringBuilder(s);
                        int i;
                        for(i =0;i< s.length();i++){
                            if( s.charAt(i) == 'ä' || s.charAt(i) == 'å' ){
                                
                                build.setCharAt(i,'a');
                                s = build.toString();
                            }
                            else if( s.charAt(i) == 'Ä' || s.charAt(i) == 'Å' ){
                                
                                build.setCharAt(i,'A');
                                s = build.toString();
                            }
                            
                            else if( s.charAt(i) == 'ö' ){
                                
                                build.setCharAt(i,'o');
                                s = build.toString();
                            }
                            else if( s.charAt(i) == 'Ö' ){
                                
                                build.setCharAt(i,'O');
                                s = build.toString();
                            }
                        }
                        return s;
                    };
        UnaryOperator<String> structit =
                (String s) -> 
                    {   
                        StringBuilder build = new StringBuilder(s);
                        String str = "sturct";
                        
                        int index = s.indexOf(str);
                        while (index >=0){
                            s = build.replace(index, index+6, "struct").toString();
                            index = s.indexOf(str, index+str.length());
                         }
                        
                        return s;
                    };

        
        Function<String, String> ketju = välilyönnit.andThen(scandit).andThen(structit); 
        String str = new String();
        
        str = ketju.apply(testString);
        System.out.println(str);
       // Pyynto p = new Pyynto(1000, 100);
        

    }
    
}
