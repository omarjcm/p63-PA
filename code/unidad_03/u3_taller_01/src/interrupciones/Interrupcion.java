package interrupciones;

import java.util.concurrent.TimeUnit;

public class Interrupcion implements Runnable {

    @Override
    public void run() {
        System.out.println("Ejecutandose() - antes de la primera chamba.");
        miPrimeraChamba();
        System.out.println("Ejecutandose() - despues de la primera chamba.");
    }

    public void miPrimeraChamba() {
        while (true) {
            System.out.println("Chambeando... - " + Thread.currentThread().getName());
            if (Thread.currentThread().isInterrupted()) {
                try {
                    System.out.println("Interrumpido() - Se acabo la chamba.");
                    TimeUnit.MILLISECONDS.sleep(1);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                    return;
                }
            }
        }
    }
}