/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista.estudiante;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import vista.Render;

/**
 *
 * @author Core i5 11va
 */
public class EstudianteTbl {
    public EstudianteTbl() {   
    }
    
    public void verTabla(JTable tabla) {
        tabla.setDefaultRenderer(Object.class, new Render());
        
        DefaultTableModel modelo = new DefaultTableModel(
                new Object[][]{},
                new Object[]{ "ID", "Cedula", "Nombre", "Apellido", "Fecha de Nacimiento", "Modificar", "Eliminar" }
        );
        
        tabla.setModel(modelo);
        tabla.setRowHeight(30);
    }
}
