/*

*/
package JButton01;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana extends JFrame{
    
    JPanel panel;
    public Ventana(){
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Primer boton");
        setLocationRelativeTo(null);
        iniciarPanel();
        iniciarBoton();
    }
    
    private void iniciarPanel(){
        panel= new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.black);
        
        this.getContentPane().add(panel);
    }
    
    private void iniciarBoton(){
        JButton boton=new JButton();{
            boton.setBounds(20, 20, 300, 100);
            
            panel.add(boton);
        }
    }
    
}
