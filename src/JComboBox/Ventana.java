/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JComboBox;

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
        setTitle("Lista desplegable");
        componentes();
    }
    
    public void componentes(){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        
        
        String paises[] ={"Mexico", "Ecuador", "Paraguay", "Chile", "Peru"};
        JComboBox lista = new JComboBox(paises);
        lista.addItem("Argentina");
        lista.setSelectedItem("Peru");
        lista.setBounds(20, 20, 100, 30);
        panel.add(lista);
        
    }
}
