package modelo.dominio;

import java.util.*;

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
}