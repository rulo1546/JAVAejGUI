/*

*/
package Ventana25;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Ventana extends JFrame{
    
    public Ventana(){
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Goku black super mamadisimo hdspm");
        setLocationRelativeTo(null);
        componentes();
        
    }
    
    private void componentes(){
        JPanel panel =new JPanel();
        panel.setBackground(Color.red);
        panel.setLayout(null);
        
        this.getContentPane().add(panel);
        
        JLabel etiqueta = new JLabel();
        etiqueta.setText("Estoy mamadisimo hdspm");
        etiqueta.setFont(new Font("Elephant", 0, 30));
        etiqueta.setBounds(10, 10, 480, 30);
        etiqueta.setOpaque(true);
        etiqueta.setBackground(Color.black);
        etiqueta.setForeground(Color.white);
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
        
        panel.add(etiqueta);
        
        JLabel etiqueta2 = new JLabel();
        ImageIcon img = new ImageIcon("gokublack.jpg");
        etiqueta2.setBounds(30, 60, (this.getWidth()-80), (this.getHeight()-110));
        
        etiqueta2.setIcon(new ImageIcon(img.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)));
        
        panel.add(etiqueta2);
    }
}
