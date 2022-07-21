/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DefaultComboBoxModel;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
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
        setTitle("Lista desplegable de objetos");
        setLocationRelativeTo(null);
        componentes();
    }
    
    public void componentes(){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        
        Persona p1= new Persona("Raul Rodriguez", 22, "Mexicano");
        Persona p2= new Persona("Lizeth Rodriguez", 15, "Mexicana");
                
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        
        modelo.addElement(p1);
        modelo.addElement(p2);
        
        JComboBox lista = new JComboBox(modelo);
        
        lista.setBounds(20, 20, 200, 40);
        
        panel.add(lista);
    }
}
