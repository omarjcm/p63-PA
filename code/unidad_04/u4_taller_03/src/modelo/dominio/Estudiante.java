package modelo.dominio;

import java.util.*;
import javax.swing.JButton;

/**
 * 
 */
public class Estudiante {

    /**
     * Default constructor
     */
    public Estudiante() {
    }

    /**
     * 
     */
    private Integer estudianteId;

    /**
     * 
     */
    private String cedula;

    /**
     * 
     */
    private String nombre;

    /**
     * 
     */
    private String apellido;

    /**
     * 
     */
    private Date fechaNacimiento;

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public void setEstudianteId(Integer estudianteId) {
        this.estudianteId = estudianteId;
    }
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = java.sql.Date.valueOf(fechaNacimiento);
    }
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getCedula() {
        return cedula;
    }
    public Integer getEstudianteId() {
        return estudianteId;
    }
    public java.sql.Date getFechaNacimiento() {
        java.sql.Date fecha = new java.sql.Date(this.fechaNacimiento.getTime());
        return fecha;
    }
    public String getNombre() {
        return nombre;
    }
    
    public Object[] getDatos() {
        
        JButton modificarBtn = new JButton( "Modificar" );
        modificarBtn.setName("M");
        JButton eliminarBtn = new JButton( "Eliminar" );
        eliminarBtn.setName("E");
        
        Object[] valores = { this.cedula, this.nombre, this.apellido, this.fechaNacimiento, modificarBtn, eliminarBtn };
        return valores;
    }
    
    @Override
    public String toString() {
        return this.cedula + "-" + this.nombre + " " + this.apellido + "-" + this.getFechaNacimiento().toString();
    }
}