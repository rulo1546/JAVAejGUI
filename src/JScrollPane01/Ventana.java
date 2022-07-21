/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JScrollPane01;

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
    public Ventana (){
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Barras de desplazamiento");
        setLocationRelativeTo(null);
        componentes();
    }
    
    private void componentes(){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        
        JTextArea areaT = new JTextArea();
        areaT.setBounds(20, 20, 200, 100);
        areaT.setText("Texto con setText");
        areaT.append("\nTexto con Append");
        panel.add(areaT);
        
        JScrollPane barras = new JScrollPane(areaT);
        barras.setBounds(20, 20, 200, 100);
        barras.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        barras.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        panel.add(barras);
        
    }
}
