/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JTextArea03;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author rulo2
 */
public class Ventana extends JFrame{
    public Ventana(){
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Deshabilitado");
        setLocationRelativeTo(null);
        componentes();
    }
    
    private void componentes(){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        
        JTextArea textArea =new JTextArea();
        textArea.setBounds(20, 20, 450, 300);
        textArea.setText("Texto con setText");
        textArea.append("\nTexto con .append (adjuntar en ingles por si es de mexico wey)");
        textArea.setEditable(false);
        
        panel.add(textArea);
    }
}
