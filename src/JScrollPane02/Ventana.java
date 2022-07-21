/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JScrollPane02;

import java.awt.ScrollPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

/**
 *
 * @author rulo2
 */
public class Ventana extends JFrame{
    public Ventana(){
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Barras de desplazamiento");
        componentes();
    }
    
    public void componentes(){
        JPanel panel = new JPanel ();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        
        JTextArea areat = new JTextArea();
        areat.setBounds(20, 20, 300, 300);
        areat.setText("Hola");
        areat.append("\nHola 2");
        panel.add(areat);
        
        JScrollPane barras = new JScrollPane(areat, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        barras.setBounds(20, 20, 300, 300);
//        barras.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
//        barras.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        panel.add(barras);
        
    }
}
