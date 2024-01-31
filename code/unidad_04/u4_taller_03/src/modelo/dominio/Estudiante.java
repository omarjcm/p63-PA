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
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }
    public String getNombre() {
        return nombre;
    }
    
    public Object[] getDatos() {
        
        JButton modificarBtn = new JButton( "Modificar" );
        JButton eliminarBtn = new JButton( "Eliminar" );
        
        Object[] valores = { this.cedula, this.nombre, this.apellido, this.fechaNacimiento, modificarBtn, eliminarBtn };
        return valores;
    }
}