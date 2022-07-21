/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JButton05;

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
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("setnemotecnick o algo a si xdxddx");
        componentes();
    }
    
    public void componentes(){
        JPanel panel=new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.BLACK);
        
        this.getContentPane().add(panel);
        
        JButton boton=new JButton();
        
        boton.setText("Clic");
        boton.setBounds(20, 20, 150, 30);
        boton.setMnemonic('s');
        
        panel.add(boton);
    }
    
    
}
