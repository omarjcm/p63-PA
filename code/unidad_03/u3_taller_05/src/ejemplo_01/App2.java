import java.util.concurrent.Semaphore;

public class App2 {
    public static void main(String[] args) throws Exception {
        Semaphore sem = new Semaphore(0);
        sem.acquire();
        System.out.println( "Permisos de ejecucion: " + sem.availablePermits() );
    }    
}