
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Core i5 11va
 */
public class App3 {
    public static void main(String[] args) {
        List arreglo = new ArrayList<MiClase>();
        MiClase<String, Float> objeto2 = new MiClase<String, Float>("Hola mundo", new Float(10.1));
        arreglo.add(objeto2);
        
        for (int i=0; i<arreglo.size(); i++) {
            MiClase<String, Float> objeto3 = (MiClase<String, Float>) arreglo.get(i);
            System.out.println( objeto3.getAtributo1() );
        }
        
        List arreglo2 = new ArrayList<MiClase>();
        MiClase<String, String> objeto4 = new MiClase<String, String>("Hola mundo", "Programacion Aplicada");
        arreglo2.add(objeto4);
        
        for (int i=0; i<arreglo2.size(); i++) {
            MiClase<String, String> objeto = (MiClase<String, String>) arreglo2.get(i);
            System.out.println( objeto.getAtributo1() );
        }
    }
}
