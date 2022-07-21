/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JRadioButton01;

import java.awt.Color;
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
        setTitle("Primer radio boton");
        componentes();
    }
    
    public void componentes(){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        
        this.getContentPane().add(panel);
        
        JRadioButton jRadioButton1 = new JRadioButton("Opcion 1.", true);
        jRadioButton1.setBounds(20, 20, 80, 30);
        panel.add(jRadioButton1);
        
        JRadioButton radioBoton2 = new JRadioButton("Opcion 2.", false);
        radioBoton2.setBounds(20, 50, 80, 30);
        panel.add(radioBoton2);
        
        JRadioButton radioBoton3 = new JRadioButton("Opcion 3.", true);
        radioBoton3.setBounds(20, 80, 80, 30);
        panel.add(radioBoton3);
        
        
    }
}
