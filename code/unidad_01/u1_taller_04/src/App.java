import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        LinkedList<Object> lista1 = new LinkedList<>();

        lista1.add(1);
        lista1.add(10);
        lista1.add(12);
        lista1.add(200);

        for (Object elemento : lista1) {
            if (((Integer)elemento) == 1000) {
                System.out.println("ELemento encontrado.");
            }
        }
    }
}
