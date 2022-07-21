/*

*/
package Ventana16;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame{
    
    public Ventana(){
        setSize(800, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Moviendo la etiqueta de lugar");
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(400, 300));
        iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        //Creando el panel 
        JPanel panel=new JPanel();
        panel.setLayout(null);
        JLabel etiqueta=new JLabel();
        etiqueta.setText("Moviendo la etiqueta de lugar");
        panel.add(etiqueta);
        this.getContentPane().add(panel);
        etiqueta.setBounds(0, 200, 300, 13);
    }
}
