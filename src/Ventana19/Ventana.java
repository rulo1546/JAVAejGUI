/*

*/
package Ventana19;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Ventana extends JFrame{
    
    public Ventana(){
        setSize(800,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Poniendo las etiqueras al centro con metodo setAligment creo xd");
        setMinimumSize(new Dimension(400, 200));
        componentes();
    }
    
    public void componentes(){
        JPanel panel=new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.black);
        
        this.getContentPane().add(panel);
        
        JLabel etiqueta=new JLabel();
        etiqueta.setOpaque(true);
        etiqueta.setBackground(Color.white);
        etiqueta.setText("HOOLA");
        etiqueta.setForeground(Color.black);
        etiqueta.setBounds(200, 300, 80 , 20);
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
        
        panel.add(etiqueta);
    }
}
