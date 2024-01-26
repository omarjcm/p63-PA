package modelo.dominio;

import java.util.*;

/**
 * 
 */
public class Grupo {

    /**
     * Default constructor
     */
    public Grupo() {
    }

    /**
     * 
     */
    private Integer grupoId;

    /**
     * 
     */
    private String nombre;

    /**
     * 
     */
    public Profesor refProfesor;

    /**
     * 
     */
    public Materia refMateria;

    /**
     * 
     */
    public Periodo refPeriodo;

    public void setGrupoId(Integer grupoId) {
        this.grupoId = grupoId;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Integer getGrupoId() {
        return grupoId;
    }
    public String getNombre() {
        return nombre;
    }

}