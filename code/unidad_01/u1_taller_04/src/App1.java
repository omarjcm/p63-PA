import java.util.LinkedList;

public class App1 {
    public static void main(String[] args) throws Exception {
        LinkedList<Object> lista1 = new LinkedList<>();

        Persona obj1 = new Persona("Julio", "Jaramillo");
        lista1.add(obj1);
        lista1.add(new Persona("Luisa", "Carrasco"));
        lista1.add(new Persona("Rosita", "Samaniego"));
        lista1.add(new Persona("Julio", "Icaza"));

        for (Object elemento : lista1) {
            Persona obj2 = new Persona("Luisa", "Carrasco");
            
            if (((Persona)elemento).esIgual(obj2)) {
                System.out.println("ELemento encontrado.");
            }
        }
    }
}