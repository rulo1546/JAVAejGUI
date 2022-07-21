/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JButton10;

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
        setLocationRelativeTo(null);
        setTitle("cambiando color y grosor de borde de boton");
        componentes();
        
    }
    
    public void componentes(){
        JPanel panel=new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.yellow);
        this.getContentPane().add(panel);
        
        JButton boton = new JButton();
        boton.setText("Clic");
        boton.setBounds(20, 20, 200, 100);
        boton.setBorder(BorderFactory.createLineBorder(Color.RED, 15));
        
        panel.add(boton);
    }
}
