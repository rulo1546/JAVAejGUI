/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPasswordField01;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

/**
 *
 * @author rulo2
 */
public class Ventana extends JFrame{
    public Ventana(){
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Cuadro de contraseña");
        componentes();
    }
    
    private void componentes(){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        
        JPasswordField pass =new JPasswordField();
        pass.setBounds(20, 20, 100, 30);
        pass.setText("Programacion");
        
        String contraseña="";
        
        for (int i = 0; i < pass.getPassword().length; i++) {
            contraseña+=pass.getPassword()[i];
        }
        
        panel.add(pass);
        System.out.println("La contraseña es: " + contraseña);
    }
}
