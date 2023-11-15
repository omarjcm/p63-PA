/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Core i5 11va
 */
public class App5 {
    public static void main(String[] args) {
        MiClase<Integer, String> objeto2 = new MiClase<Integer, String>(100, "Hola mundo");
        Integer numero2 = objeto2.getAtributo1();
        System.out.println(numero2);

        String texto2 = objeto2.metodo(numero2);
        System.out.println(texto2);        
       
    }
}
