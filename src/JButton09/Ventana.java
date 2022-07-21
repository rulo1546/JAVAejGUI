/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JButton09;

import java.awt.Color;
import javax.swing.BorderFactory;
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
        setTitle("Cambiando de color el borde del boton");
        setLocationRelativeTo(null);
        componentes();
    }
    
    private void componentes(){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.YELLOW);
        
        this.getContentPane().add(panel);
        
        JButton boton1=new JButton();
        boton1.setBounds(10, 20, 300, 100);
        boton1.setText("Clic");
        boton1.setBorder(BorderFactory.createLineBorder(Color.PINK));
        
        panel.add(boton1);
    }
}
