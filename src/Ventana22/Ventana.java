/*

*/
package Ventana22;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Ventana extends JFrame{
    
    public Ventana(){
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("xd");
        setLocationRelativeTo(null);
        componentes();
    }
    
    private void componentes(){
        
        JPanel panel=new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.black);
        
        this.getContentPane().add(panel);
        
        JLabel etiqueta1=new JLabel();
        etiqueta1.setText("Mundial 2018");
        etiqueta1.setForeground(Color.white);
        etiqueta1.setBounds(10, 20, 480, 40);
        etiqueta1.setFont(new Font("Cooper Black", 0, 40));
        etiqueta1.setHorizontalAlignment(SwingConstants.CENTER);
        
        panel.add(etiqueta1);
        
        ImageIcon imagen=new ImageIcon("balon.jpg");
        JLabel etiqueta2 = new JLabel(imagen);
        etiqueta2.setBounds(10, 70, 500, 500);
        
        panel.add(etiqueta2);
    }
}
