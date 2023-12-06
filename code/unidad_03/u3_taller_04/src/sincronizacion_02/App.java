package sincronizacion_02;

public class App {
    public static void main(String[] args) {
        Mensaje mensaje = new Mensaje("Procesando...");

        Lector lector1 = new Lector(mensaje);
        new Thread(lector1, "LECTOR 1").start();

        Lector lector2 = new Lector(mensaje);
        new Thread(lector2, "LECTOR 2").start();

        Notificador notificador = new Notificador(mensaje);
        new Thread(notificador, "NOTIFICADOR").start();

        System.out.println("Todos los hilos han iniciado.");
   }
}
