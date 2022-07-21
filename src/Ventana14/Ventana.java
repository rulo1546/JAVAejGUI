/*

*/
package Ventana14;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Ventana extends JFrame{
    
    public Ventana(){
        setSize(800, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Agregando una etiqueta.");
        setMinimumSize(new Dimension(400, 200));
        iniciarComponentes();
        
    }
    
    private void iniciarComponentes(){
        //creando el panel
        JPanel panel = new JPanel();
        //no le voy a poner color al panel
        //panel.setBackground(Color.yellow);
        this.getContentPane().add(panel);
        
        //creando etiquetas
        JLabel etiqueta=new JLabel("Primera etiqueta");
        panel.add(etiqueta);
        
    }
}
