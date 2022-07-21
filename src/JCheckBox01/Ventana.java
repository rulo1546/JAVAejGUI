/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JCheckBox01;

import javax.swing.JCheckBox;
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
        setTitle("CheckBox");
        setLocationRelativeTo(null);
        componentes();
    }
    
    private void componentes(){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        
        JCheckBox box = new JCheckBox("Opcion 1", true);
        box.setBounds(20, 20, 100, 40);
        
        panel.add(box);
        
        JCheckBox box2 = new JCheckBox("Opcion 2", true);
        box2.setBounds(20, 150, 100, 40);
        
        panel.add(box2);
    }
}
