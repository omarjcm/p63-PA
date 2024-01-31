/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package modelo.bd;

import java.util.ArrayList;
import modelo.dominio.Estudiante;

/**
 *
 * @author Core i5 11va
 */
public interface ObjetoBD {
    
    public void registrar(Object objeto);
    public void modificar(Object objeto);
    public void eliminar(Object objeto);
    public Object buscar(Object objeto);
    public ArrayList<Object> listar();
    
}
