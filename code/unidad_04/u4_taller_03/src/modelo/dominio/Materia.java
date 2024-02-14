package modelo.dominio;

import java.util.*;

/**
 * 
 */
public class Materia {

    /**
     * Default constructor
     */
    public Materia() {
    }
    
    /**
     * 
     */
    private Integer materiaId;

    /**
     * 
     */
    private String nombre;

    public void setMateriaId(Integer materiaId) {
        this.materiaId = materiaId;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Integer getMateriaId() {
        return materiaId;
    }
    public String getNombre() {
        return nombre;
    }
}