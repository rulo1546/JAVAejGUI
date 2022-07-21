/*

*/
package Ventana13;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author rulo2
 */
public class Ventana extends JFrame{
    
    public Ventana(){
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Agregando un panel color amarillo sobre mi ventana");
        setMinimumSize(new Dimension(400, 400));
        iniciarComponentes(); 
    }
    
    private void iniciarComponentes(){
        JPanel panel=new JPanel();
        panel.setBackground(Color.yellow);
        this.getContentPane().add(panel);
    }
}
