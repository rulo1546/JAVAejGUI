/*

*/
package Ventana11;

import java.awt.Dimension;
import javax.swing.JFrame;

public class Ventana extends JFrame{
    
    public Ventana(){
        setSize(450,450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("minimo tamaño con setMinimunSize de 300,300");
        setMinimumSize(new Dimension(300, 300));
        setLocationRelativeTo(null);
    }
}
