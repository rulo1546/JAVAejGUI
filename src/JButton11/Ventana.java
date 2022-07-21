/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JButton11;

import java.awt.Color;
import java.awt.Font;
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
        setTitle("Cambiando grosor, color, y curva del borde del boton");
        setLocationRelativeTo(null);
        componentes();
    }
    
    public void componentes(){
        JPanel panel=new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        
        JButton boton = new JButton();
        boton.setBounds(20, 20, 300, 200);
        boton.setText("Clic");
        boton.setFont(new Font("Cooper", 0, 30));
        boton.setBorder(BorderFactory.createLineBorder(Color.yellow, 10, true));
        
        panel.add(boton);
    }
}
