package ejercicio01;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        LinkedList<Object> lista = new LinkedList<Object>();

        Persona objeto1 = new Persona("Luis", "Cornejo");
        Persona objeto2 = new Persona("Fabricio", "Echeverria");

        lista.add(objeto1);
        lista.add(objeto2);

        for (Object elemento: lista) {
            System.out.println(elemento);
        }

        System.out.println("****************************");

        Materia objeto3 = new Materia("Programacion Aplicada");
        Materia objeto4 = new Materia("Fundamentos de Bases de Datos");

        lista.add(objeto3);
        lista.add(objeto4);

        for (Object elemento: lista) {
            System.out.println(elemento);
        }

        System.out.println("****************************");

        for (Object elemento: lista) {
            if (elemento instanceof Persona) {
                System.out.println(((Persona) elemento).getApellido());
            } else if (elemento instanceof Materia) {
                System.out.println( "La materia es: " + ((Materia) elemento).getMateria() );
            }
        }
    }
}
