package sincronizacion_02;

public class App {
    public static void main(String[] args) {
        Mensaje mensaje = new Mensaje("Procesando...");

        Lector lector1 = new Lector(mensaje);
    }
}
