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
import java.awt.EventQueue;
import javax.swing.JFrame;

public class APP extends JFrame {

    public APP() {
        
        initUI();
    }
    
    private void initUI() {
        
        add(new Board());
        
        setSize(500, 1000);
        setResizable(false);
        
        setTitle("PIRSSI 3000");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                
                APP app = new APP();
                app.setVisible(true);
            }
        });
    }
}