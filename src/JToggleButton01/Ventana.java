/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JToggleButton01;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

/**
 *
 * @author rulo2
 */
public class Ventana extends JFrame{
    public Ventana(){
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("JToggleButton");
        componentes();
    }
    
    public void componentes(){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        
        JToggleButton b1 = new JToggleButton("Opcion 1.", true);
        b1.setBounds(30, 30, 100, 25);
        panel.add(b1);
        
        JToggleButton b2 = new JToggleButton("Opcion 2.", false);
        b2.setBounds(30, 60, 100, 25);
        panel.add(b2);
        
        JToggleButton b3= new JToggleButton("Opcion 3.", false);
        b3.setBounds(30, 90, 100, 25);
        panel.add(b3);
        
        
        ButtonGroup botones = new ButtonGroup();
        botones.add(b3);
        botones.add(b2);
        botones.add(b1);
        
        
    }
}
