/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Core i5 11va
 */
public class App2 {
    public static void main(String[] args) {
        MiClase<String, Float> objeto2 = new MiClase<String, Float>("Hola mundo", new Float(10));
        Float numero2 = objeto2.getAtributo1();
        System.out.println(numero2);

        String texto2 = objeto2.metodo(numero2);
        System.out.println(texto2);        
    }
}
