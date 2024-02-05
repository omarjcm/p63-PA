/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import java.lang.Object;
import modelo.bd.EstudianteBD;
import modelo.dominio.Estudiante;

/**
 *
 * @author Core i5 11va
 */
public class GestionarEstudiante implements GestionarObjeto {
    public GestionarEstudiante() {
        
    }
    
    public ArrayList<Object> listar() {
        EstudianteBD bd = new EstudianteBD();
        return bd.listar();
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
