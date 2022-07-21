/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JRadioButton02;

import javax.swing.ButtonGroup;
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
        setLocationRelativeTo(null);
        setTitle("Grupo de botones");
        componentes();
    }
    
    public void componentes(){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        
        JRadioButton b1 = new JRadioButton("Opcion 1.", true);
        b1.setBounds(20, 20, 80, 40);
        panel.add(b1);
        
        JRadioButton b2 = new JRadioButton("Opcion 2.", false);
        b2.setBounds(20, 60, 80, 40);
        panel.add(b2);
        
        JRadioButton b3 = new JRadioButton("Opcion 3.", true);
        b3.setBounds(20, 100, 80, 40);
        panel.add(b3);
        
        ButtonGroup misBotones = new ButtonGroup();
        misBotones.add(b1);
        misBotones.add(b2);
        misBotones.add(b3);
        
    }
}
