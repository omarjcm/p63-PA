package modelo.dominio;

import java.util.*;

/**
 * 
 */
public class Profesor {

    /**
     * Default constructor
     */
    public Profesor() {
    }

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
    private Integer profesorId;

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setProfesorId(Integer profesorId) {
        this.profesorId = profesorId;
    }
    public String getApellido() {
        return apellido;
    }
    public String getCedula() {
        return cedula;
    }
    public String getNombre() {
        return nombre;
    }
    public Integer getProfesorId() {
        return profesorId;
    }
}