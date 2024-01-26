package modelo.dominio;

import java.util.*;

/**
 * 
 */
public class Periodo {

    /**
     * Default constructor
     */
    public Periodo() {
    }

    /**
     * 
     */
    private Integer periodoId;

    /**
     * 
     */
    private String nombre;

    /**
     * 
     */
    private Integer anioInicial;

    /**
     * 
     */
    private Integer anioFinal;

    public void setAnioFinal(Integer anioFinal) {
        this.anioFinal = anioFinal;
    }
    public void setAnioInicial(Integer anioInicial) {
        this.anioInicial = anioInicial;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPeriodoId(Integer periodoId) {
        this.periodoId = periodoId;
    }
    public Integer getAnioFinal() {
        return anioFinal;
    }
    public Integer getAnioInicial() {
        return anioInicial;
    }
    public String getNombre() {
        return nombre;
    }
    public Integer getPeriodoId() {
        return periodoId;
    }
}