/*

*/
package Ventana20;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Ventana extends JFrame{
    
    public Ventana(){
        setSize(460, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Cambiando el tipo de letra a una etiqueta");
        setLocationRelativeTo(null);
        //setMinimumSize(new Dimension(700, 300));
        componentes();
    }
    
    public void componentes(){
        JPanel panel=new JPanel();
        panel.setBackground(Color.black);
        panel.setLayout(null);
        
        this.getContentPane().add(panel);
        
        JLabel etiqueta=new JLabel();
        etiqueta.setText("tonto");
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta.setForeground(Color.black);
        etiqueta.setOpaque(true);
        etiqueta.setBackground(Color.white);
        etiqueta.setBounds(20, 20, 400, 200);
        etiqueta.setFont(new Font("arial", Font.BOLD, 90));
        
        panel.add(etiqueta);
    }
}
