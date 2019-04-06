/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neljäslabra;

/**
 *
 * @author aaro
 */
import java.util.Scanner;
public class Kuukausitaulukko {
    static Scanner lukija = new Scanner(System.in);
    
    public static String kuukausi(int arvo){
    String[] sana = {"Null","Tammikuu", "Helmikuu","Maaliskuu", "Huhtikuu", "Toukokuu", "Kesäkuu", "Heinäkuu", "Elokuu", "Syyskuu", "Lokakuu", "Marraskuu", "Joulukuu"};
    if (arvo>0 && arvo <13) {
    return sana[arvo] ;
    } else return sana[0];

    }
    public static void main(String[] args) {
        String jotain;
        int numero;
        do{
        System.out.println("Mones kuukausi? Numero 30 lopettaa loopin. ");
        numero = lukija.nextInt();
        System.out.println("se on " + kuukausi(numero));
        } while (!(numero == 30));
        
    }
    
}
