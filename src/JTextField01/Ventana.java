/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JTextField01;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author rulo2
 */
public class Ventana extends JFrame{
    public Ventana(){
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Caja de texto");
        setLocationRelativeTo(null);
        componentes();
    }
    
    public void componentes(){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        
        JTextField t1 = new JTextField();
        t1.setBounds(20, 20, 100, 30);
        t1.setText("Hola...");
        System.out.println(t1.getText());
        panel.add(t1);
    }
    
    
}
