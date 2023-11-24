package hilos;
public class App4 {
    public static void main(String[] args) {
        Thread t1 = new Thread( Hilo::execute );
        Thread t2 = new Thread( Hilo::execute );
        Thread t3 = new Thread( Hilo::execute );
        Thread t4 = new Thread( Hilo::execute );

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
