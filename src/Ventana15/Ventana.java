/*

*/
package Ventana15;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Ventana extends JFrame{
    
    public Ventana(){
        setSize(800, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("segunda etiqueta");
        setMinimumSize(new Dimension(400, 200));
        iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        JPanel panel=new JPanel();
        
        JLabel etiqueta=new JLabel();
        etiqueta.setText("Segunda etiqueta");
        
        panel.add(etiqueta);
        
        this.getContentPane().add(panel);
    }
}
