/*

*/
package JButton03;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Ventana extends JFrame {
    public Ventana(){
        setSize(700, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Boton xddxd");
        setLocationRelativeTo(null);
        iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        JPanel panel=new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.BLACK);
        
        this.getContentPane().add(panel);
        
        JButton boton=new JButton();
        boton.setBounds(40, 40, 200, 100);
        boton.setText("Clic a qui porfavor xdxd");
        
        panel.add(boton);
    }
}
