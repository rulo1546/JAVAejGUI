/*

*/
package Ventana17;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame{
    
    public Ventana(){
        setSize(800,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Cambiando color de la letra y el fondo de esa etiqueta");
        setMinimumSize(new Dimension(400, 200));
        componentes();
    }
    
    private void componentes(){
        JPanel panel=new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.DARK_GRAY);
        
        this.getContentPane().add(panel);
        
        JLabel etiqueta=new JLabel();
        etiqueta.setOpaque(true);
        etiqueta.setText("Buenas tardes");
        etiqueta.setBounds(300, 200, 90, 90);
        etiqueta.setForeground(Color.white);
        etiqueta.setBackground(Color.black);
        panel.add(etiqueta);
        
    }
}
