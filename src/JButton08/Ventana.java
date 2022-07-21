/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JButton08;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author rulo2
 */
public class Ventana extends JFrame {
    public Ventana(){
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Boton mamalon");
        setLocationRelativeTo(null);
        componentes();
    }
    
    
    private void componentes(){
        JPanel panel=new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.WHITE);
        this.getContentPane().add(panel);
        
        JButton boton=new JButton();
        ImageIcon img = new ImageIcon("boton.png");
        boton.setBounds(20, 20, 200, 100);
        boton.setIcon(new ImageIcon(img.getImage().getScaledInstance(200, 100, Image.SCALE_SMOOTH)));
        panel.add(boton);
    }
}
