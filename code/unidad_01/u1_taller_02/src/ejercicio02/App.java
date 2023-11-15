package ejercicio02;

import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        LinkedList<Object> lista = new LinkedList<Object>();

        MiClase<String, String> obj1 = new MiClase<String, String>("A", "B");
        MiClase<String, String> obj2 = new MiClase<String, String>("C", "D");
        lista.add(obj1);
        lista.add(obj2);

        for (Object elemento : lista) {
            MiClase<String, String> obj = (MiClase<String, String>) elemento;
            System.out.println(obj);
        }

        MiClase<String, Integer> obj3 = new MiClase<String, Integer>("E", 100);
        MiClase<String, Integer> obj4 = new MiClase<String, Integer>("F", 200);
        lista.add(obj3);
        lista.add(obj4);

        for (Object elemento : lista) {
            MiClase obj = (MiClase) elemento;
            System.out.println(obj);
        }
    }
}
