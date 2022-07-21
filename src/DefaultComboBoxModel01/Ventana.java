/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DefaultComboBoxModel01;

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
        setLocationRelativeTo(null);
        setTitle("Lista de objetos personas");
        componentes();
    }
    
    public void componentes(){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        
        //creando el model para pasarselo al JComboBox
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        
        //Creando los objetos de tipo persona
        Persona p1=new Persona("Raul Rodriguez", 22, "Mexicano");
        Persona p2=new Persona("Lizeth Pichardo", 15, "Peruana");
        
        //agregando al modelo 
        modelo.addElement(p1);
        modelo.addElement(p2);
        
        //le pasamos el modelo el JComboBox
        JComboBox lista = new JComboBox(modelo);
        lista.setBounds(20, 20, 200, 30);
        
        panel.add(lista);
    }
}
