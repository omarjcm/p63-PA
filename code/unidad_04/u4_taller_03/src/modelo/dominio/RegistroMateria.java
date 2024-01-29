package modelo.dominio;

import java.util.*;

/**
 * 
 */
public class RegistroMateria {

    /**
     * Default constructor
     */
    public RegistroMateria() {
    }

    /**
     * 
     */
    private Integer registroMateriaId;

    /**
     * 
     */
    public Grupo refGrupo;

    /**
     * 
     */
    public Estudiante refEstudiante;

    public void setRegistroMateriaId(Integer registroMateriaId) {
        this.registroMateriaId = registroMateriaId;
    }
    public Integer getRegistroMateriaId() {
        return registroMateriaId;
    }
}