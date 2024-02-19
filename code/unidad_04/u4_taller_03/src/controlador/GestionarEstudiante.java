/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import modelo.bd.EstudianteBD;

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
        EstudianteBD bd = new EstudianteBD();
        bd.registrar(objeto);
    }

    @Override
    public void modificar(Object objeto) {
        EstudianteBD bd = new EstudianteBD();
        bd.modificar(objeto);
    }

    @Override
    public void eliminar(Object objeto) {
        EstudianteBD bd = new EstudianteBD();
        bd.eliminar(objeto);
    }

    @Override
    public ArrayList<Object> buscar(Object objeto) {
        EstudianteBD bd = new EstudianteBD();
        return bd.buscar(objeto);
    }
}
