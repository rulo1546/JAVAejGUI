/*

*/
package Ventana10;

import javax.swing.JFrame;

public class Ventana extends JFrame{
    
    public Ventana(){
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("No se puede cambiar de tamaño set resisable false");
        setResizable(false);
        setLocationRelativeTo(null);
    }
    
}
