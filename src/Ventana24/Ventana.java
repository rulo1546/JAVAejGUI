/*

*/
package Ventana24;

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
        setSize(900, 700);
        setTitle("Ajustando el tamaño de la imagen");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        componentes();
    }
    
    private void componentes(){
        JPanel panel=new JPanel();
        panel.setBackground(Color.black);
        panel.setLayout(null);
        
        this.getContentPane().add(panel);
        
        JLabel texto= new JLabel();
        texto.setText("Mundial 2018");
        texto.setForeground(Color.white);
        texto.setFont(new Font("Ink Free", 0, 40));
        texto.setBounds(10, 10, 970, 30);
        texto.setHorizontalAlignment(SwingConstants.CENTER);
        
        panel.add(texto);
        
        JLabel imagen = new JLabel();
        ImageIcon img = new ImageIcon("balon.jpg");
        imagen.setBounds(200, 100, 500, 500);
        
        imagen.setIcon(new ImageIcon(img.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH)));
        
        panel.add(imagen);
        
        //1.-se crea la etiqueta
        //2.- se crea el ImageIcon
        //3.- se posiciona la etiqueta, y se define ancho/alto
        //4.-a set icon le pasas una nueva imageIcon que le pasas la imagen.getImage
        //que llama al metodo getScaledInstance(aancho,largo, image.scale (tipo de escala) 
    }
}
