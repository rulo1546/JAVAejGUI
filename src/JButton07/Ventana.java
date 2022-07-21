/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JButton07;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author rulo2
 */
public class Ventana extends JFrame{
    public Ventana(){
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Boton de color");
        componentes();
    }
    
    public void componentes(){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.BLACK);
        this.getContentPane().add(panel);
        
        JButton boton = new JButton();
        boton.setBounds(20, 20, 100, 100);
        boton.setText("Clic");
        boton.setForeground(Color.BLACK);
        boton.setFont(new Font("Elephant", 0    , 30));
        boton.setBackground(Color.yellow);
        panel.add(boton);
    }
}
