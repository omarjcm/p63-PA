package sincronizacion;

import java.util.ArrayList;
import java.util.List;

public class AppCS {

    private static int contador = 0;
    public static void main(String[] args) throws InterruptedException {
        List<Thread> hilos = new ArrayList<>();
        int numHilos = 10000;

        for (int i=1; i<=numHilos; i++) {
            //Thread hilo = new Thread( AppCS::incrementar );
            Thread hilo = new Thread( AppCS::incrementarCB );
            hilos.add(hilo);
            hilo.start();
        }

        for (Thread hilo: hilos) {
            hilo.join();
        }

        System.out.println(contador);
    }

    public synchronized static void incrementar() {
        contador++;
    }

    public static void incrementarCB() {
        synchronized (AppCS.class) {
            contador++;
        }
    }
}
