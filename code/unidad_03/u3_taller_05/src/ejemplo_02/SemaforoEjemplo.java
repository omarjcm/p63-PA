package ejemplo_02;

import java.util.concurrent.Semaphore;

public class SemaforoEjemplo {
    public static void main(String[] args) {
        Semaphore sem = new Semaphore(3);
        Recurso recurso = new Recurso();

        for (int i=0; i<5; i++) {
            new Trabajador(recurso, sem).start();
        }
    }
}
