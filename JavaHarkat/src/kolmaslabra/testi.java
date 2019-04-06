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
public class testi {

    public static void main(String[] args) {

        Anturi olio1 = new Anturi();
        System.out.println("lämpö on " + olio1.getLämpötila());
        olio1.setMin(50);
        olio1.setMax(100);
        System.out.println(olio1.getLämpötila());
        olio1.Anturi(200, 300);

        System.out.println(olio1.getLämpötila());

        olio1.Anturi(1000, 2000);
        Mittari olio2 = new Mittari(olio1);
        olio2.näytä();
    }

}
