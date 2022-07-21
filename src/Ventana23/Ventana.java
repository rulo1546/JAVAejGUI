/*

*/
package Ventana23;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author rulo2
 */
public class Ventana extends JFrame{
    
    public Ventana(){
        setSize(900,720);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Equisdedededededededededededede");
        setLocationRelativeTo(null);
        componentes();
        
    }
    
    private void componentes(){
        JPanel panel=new JPanel();
        panel.setBackground(Color.black);
        panel.setLayout(null);
        
        this.getContentPane().add(panel);
        
        JLabel letras=new JLabel();
        letras.setText("Mundial 2018 totalmente en vivo");
        letras.setFont(new Font("Ink Free", 0, 40));
        letras.setBounds(10, 10, 870, 40);
        letras.setHorizontalAlignment(SwingConstants.CENTER);
        letras.setForeground(Color.white);
        
        panel.add(letras);
        
        JLabel imagen = new JLabel();
        imagen.setIcon(new ImageIcon("balon.jpg"));
        imagen.setBounds(150, 60, 600, 600);
        
        panel.add(imagen);
    }
}
