package ejemplo_02;

import java.util.concurrent.Semaphore;

public class Trabajador extends Thread {
    private Recurso recurso;
    private Semaphore sem;

    public Trabajador(Recurso recurso, Semaphore sem) {
        this.recurso = recurso;
        this.sem = sem;
    }

    @Override
    public void run() {
        try {
            this.sem.acquire();
            System.out.println( "Num. de Permisos: " + this.sem.availablePermits() );
            this.recurso.uso();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            this.sem.release();
        }

    }
}
