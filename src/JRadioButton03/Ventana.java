/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JRadioButton03;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author rulo2
 */
public class Ventana extends JFrame{
    public Ventana(){
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Desactivando un botton");
        setLocationRelativeTo(null);
        componentes();
    }
    
    public void componentes(){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        
        JRadioButton b1=new JRadioButton("Opcion1.", false);
        b1.setBounds(20, 20, 80, 30);
        b1.setEnabled(false);
        
        panel.add(b1);
        
        JRadioButton b2=new JRadioButton("Opcion2.", false);
        b2.setBounds(20, 60, 200, 50);
        b2.setEnabled(true);
        b2.setFont(new Font("Cooper black", 0, 20));
        b2.setForeground(Color.BLUE);
        
        panel.add(b2);
    }
    
    
}
