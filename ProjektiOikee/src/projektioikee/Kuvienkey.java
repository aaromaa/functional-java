/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projektioikee;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Kuvienkey extends JFrame {
    Image image;
//Variables

    int y, x;
//Double Buffer
    private Image dbImage;
    private Graphics dbg;

//Window Basics

        private void initKuvienkey() {
        ImageIcon kuvared = new ImageIcon("src/images/cartrack_menuscreen.png");
        
        image = kuvared.getImage();      
    }
    //Controls
    public class AL extends KeyAdapter {

        @Override
        public void keyPressed(KeyEvent event) {
            int keyCode = event.getKeyCode();
            if (keyCode == event.VK_LEFT)
            {
                x=1;
            }
            if (keyCode == event.VK_RIGHT)
            {
                x++;
            }
            if (keyCode == event.VK_UP)
            {
                y--;
            }
            if (keyCode == event.VK_DOWN)
            {
                y++;
            }
        }

        @Override
        public void keyReleased(KeyEvent event) {
        }
    }
        public Image getImage() {
        return image;
    }
        public int getx(){
            return x;
        }
}