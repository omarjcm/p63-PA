package ejemplo_01;
import java.util.concurrent.Semaphore;

public class App {
    public static void main(String[] args) throws Exception {
        Semaphore sem = new Semaphore(1);
        sem.acquire();
        System.out.println( "Permisos de ejecucion: " + sem.availablePermits() );
    }
}
