/*

*/
package Ventana21;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Ventana extends JFrame{
    public Ventana(){
        
        setSize(635, 740);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Mundial");
        setLocationRelativeTo(null);
        componentes();
    }
    
    public void componentes(){
        JPanel panel=new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.black);
        this.getContentPane().add(panel);
        
        JLabel etiqueta=new JLabel();
        etiqueta.setText("Mundial 2018");
        etiqueta.setFont(new Font("Cooper Black", 0, 40));
        etiqueta.setBounds(0, 0, 635, 80);
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta.setForeground(Color.white);
        
        panel.add(etiqueta);
        
        
        JLabel etiqueta2=new JLabel(new ImageIcon("balon.jpg"));
        etiqueta2.setBounds(10, 90, 600, 600);
        etiqueta2.setHorizontalAlignment(SwingConstants.CENTER);
        
        panel.add(etiqueta2);
    }
}
