package ejemplo_03;

import java.util.concurrent.Semaphore;

public class Carro extends Thread {
    private String direccion;
    private Semaphore sem;

    public Carro(String direccion, Semaphore sem) {
        this.direccion = direccion;
        this.sem = sem;
    }

    @Override
    public void run() {
        try {
            System.out.println("Carro esperando ir hacia " + this.direccion);
            this.sem.acquire();
            System.out.println("Carro avanzando hacia " + this.direccion);
            Thread.sleep(1000);
            System.out.println("Carro avanzo hacia " + this.direccion);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            this.sem.release();
        }
    }
}
