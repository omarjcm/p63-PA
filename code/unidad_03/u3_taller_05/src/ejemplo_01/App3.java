import java.util.concurrent.Semaphore;

public class App3 {
    public static void main(String[] args) throws InterruptedException {
        Semaphore sem = new Semaphore(10);
        sem.acquire();
        System.out.println( "Permisos de ejecucion: " + sem.availablePermits() );
        sem.release();
        System.out.println( "Permisos de ejecucion: " + sem.availablePermits() );
    }
}
