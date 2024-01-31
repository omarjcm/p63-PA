/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.bd;

import datos.BD;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.dominio.Estudiante;

/**
 *
 * @author Core i5 11va
 */
public class EstudianteBD extends Estudiante implements ObjetoBD {
    
    private BD bd;
    
    public EstudianteBD() {
        this.bd = new BD();
    }
     
    @Override
    public ArrayList<Object> listar() {
        ArrayList<Object> estudiantes = new ArrayList<Object>();
        
        try {
            this.bd.conectar();
            String sql = "SELECT * FROM estudiante;";
            ResultSet rs = this.bd.ejecutar(sql);
            while (rs.next()) {
                Estudiante objeto = new Estudiante();
                objeto.setEstudianteId( rs.getInt("estudianteId") );
                objeto.setCedula( rs.getString("cedula") );
                objeto.setNombre( rs.getString("nombre") );
                objeto.setApellido( rs.getString("apellido") );
                objeto.setFechaNacimiento(rs.getDate("fechaNacimiento") );
                
                estudiantes.add(objeto);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EstudianteBD.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            this.bd.cerrar();            
        }
        
        return estudiantes;
    }
    
    public static void main(String[] args) {
        EstudianteBD obj = new EstudianteBD();
        ArrayList<Object> estudiantes = obj.listar();
        for (Object objeto : estudiantes) {
            System.out.println( ((Estudiante) objeto).getCedula() );
        }
    }

    @Override
    public void registrar(Object objeto) {
    }

    @Override
    public void modificar(Object objeto) {
    }

    @Override
    public void eliminar(Object objeto) {
    }

    @Override
    public Object buscar(Object objeto) {
        return null;
    }
}
