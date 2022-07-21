/*

*/
package Ventana12;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;

public class Ventana extends JFrame{
    
    public Ventana(){
        setSize(800, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(400, 200));
        setTitle("Cambiando el color de la ventana con getContentPane().setBackground(color.x)");
        this.getContentPane().setBackground(Color.yellow);
        
    }
}
