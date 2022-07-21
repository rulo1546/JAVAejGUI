/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JButton04;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author rulo2
 */
public class Ventana extends JFrame{
    public Ventana(){
        setSize(700, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Dos botones xd");
        setLocationRelativeTo(null);
        componentes();
    }
    
    private void componentes(){
        JPanel panel=new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.BLACK);
        this.getContentPane().add(panel);
        
        JButton b1 =new JButton();
        JButton b2=new JButton();
        
        b1.setBounds(20, 20, 100, 50);
        b1.setText("Habilitado");
        
        b2.setBounds(100, 100, 150, 50);
        b2.setText("Deshabilitado");
        b2.setEnabled(false);
        
        panel.add(b1);
        panel.add(b2);
        
        
    }
}
