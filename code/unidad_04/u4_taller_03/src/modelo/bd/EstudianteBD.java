/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.bd;

import datos.BD;
import java.util.ArrayList;
import modelo.dominio.Estudiante;

/**
 *
 * @author Core i5 11va
 */
public class EstudianteBD extends Estudiante {
    
    private BD bd;
    
    public EstudianteBD() {
        this.bd = new BD();
    }
    
    public ArrayList<Estudiante> listar() {
        ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
        
        this.bd.conectar();
        String sql = "SELECT * FROM estudiante;";
        this.bd.cerrar();
    }
}
