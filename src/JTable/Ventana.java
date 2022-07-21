package JTable;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

public class Ventana extends JFrame{
    public Ventana(){
        setSize(500 , 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Tabla");
        setLocationRelativeTo(null);
        componentes();
    }
    
    private void componentes(){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Edad");
        
        String persona1[]={"Raul", "Rodriguez", "22"};
        String persona2[]={"Juan", "Perez", "20"};
        String persona3[]={"Rosa", "Aguilar", "15"};
        String persona4[]={"Mariana", "Sanchez", "22"};
        String persona5[]={"Lizeth", "Rodriguez", "15"};
        String persona6[]={"Sergio", "Segura", "22"};
        String persona7[]={"Jose", "Alfredo", "15"};
        String persona8[]={"Giovolastik", "Lopez", "25"};
        String persona9[]={"John", "Cena", "22"};
        String persona10[]={"Mario", "Molina", "50"};
        
        modelo.addRow(persona1);
        modelo.addRow(persona2);
        modelo.addRow(persona3);
        modelo.addRow(persona4);
        modelo.addRow(persona5);
        modelo.addRow(persona6);
        modelo.addRow(persona7);
        modelo.addRow(persona8);
        modelo.addRow(persona9);
        modelo.addRow(persona10);
        
        JTable table = new JTable(modelo);
        table.setBounds(20, 20, 300, 150);
        panel.add(table);
        
        JScrollPane barras = new JScrollPane(table, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        barras.setBounds(20, 20, 300, 150);
        panel.add(barras);
        
    }
    
    
}
