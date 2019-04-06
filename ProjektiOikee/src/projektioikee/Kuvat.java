/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projektioikee;

/**
 *
 * @author aaro
 */
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
public class Kuvat{
    Kuvienkey kuvia = new Kuvienkey();
public void paintComponent(Graphics g) {
        

        doDrawing(g);

        Toolkit.getDefaultToolkit().sync();
    }

    private void doDrawing(Graphics g) {
        
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(kuvia.getImage(), 100, 100, null);



    }
}