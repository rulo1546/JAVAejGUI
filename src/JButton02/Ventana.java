/*

*/
package JButton02;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Ventana extends JFrame{
    
    public Ventana(){
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Segundo boton");
        setLocationRelativeTo(null);
        iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        JPanel panel=new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.black);
        this.getContentPane().add(panel);
        
        JButton boton=new JButton("Clic a qui");
        boton.setBounds(20, 20, 100, 80);
        
        panel.add(boton);
    }
}
