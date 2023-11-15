/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Core i5 11va
 */
public class App6 {
    public static void main(String[] args) {
        MiClase<String, String> obj = new MiClase<String, String>("A", "B");
        A objeto1 = new A(obj);
        System.out.println( objeto1.atributo.getAtributo1() );

        MiClase<Integer, Integer> obj2 = new MiClase<Integer, Integer>(100, 200);
        A objeto2 = new A(obj2);
        System.out.println( objeto2.atributo.getAtributo1() );
    }
}
