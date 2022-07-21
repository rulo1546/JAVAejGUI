/*

*/
package Ventana18;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class Ventana extends JFrame{
    
    public Ventana(){
        setSize(800, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Etiquetas al centro");
        setMinimumSize(new Dimension(400, 200));
        componentes();
    }
    
    private void componentes(){
        JPanel panel=new JPanel();
        panel.setLayout(null); //(desactivar layout x defecto )para poner tus etiquetas donde quiera
        panel.setBackground(Color.red);
        this.getContentPane().add(panel);
        
        JLabel etiqueta=new JLabel("Hola", SwingConstants.CENTER);
        etiqueta.setForeground(Color.white);
        etiqueta.setOpaque(true);
        etiqueta.setBackground(Color.black);
        etiqueta.setBounds(400, 200, 60, 20);
        panel.add(etiqueta);
        
    }
}
