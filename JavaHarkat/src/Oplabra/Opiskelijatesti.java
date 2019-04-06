/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oplabra;

/**
 *
 * @author aaro
 */
public class Opiskelijatesti {

    public static void main(String[] args) {

        Opiskelija yhteyskalle = new Opiskelija("121212", "Kalle", "Kustaa");
        Opiskelija matti = new Opiskelija("343434", "Matti", "Mattila");
        Opiskelija juha = new Opiskelija("565656", "Juha", "kontti");
        Opiskelija jukka = new Opiskelija("787878", "Jukka", "juska");

        Opiskelijaryhmä oppilas1 = new Opiskelijaryhmä("1", yhteyskalle);
        
        Opiskelijalista oppilas2 = new Opiskelijalista("2",yhteyskalle);




        System.out.println(yhteyskalle.optoString() + matti.optoString() + juha.optoString());

        Opiskelija oletus = new Opiskelija();
        System.out.println(oletus.optoString());
        oletus.setopnumero("999999");
        oletus.setetunimi("joku");
        oletus.setsukunimi("jotain");
        System.out.println(oletus.optoString());
        
        oppilas1.lisää(juha);
        oppilas1.lisää(matti);
        oppilas1.lisää(jukka);
        oppilas1.tulosta();
        
        oppilas2.lisää(juha);
        oppilas2.lisää(matti);
        oppilas2.tulosta();
        
    }
}
