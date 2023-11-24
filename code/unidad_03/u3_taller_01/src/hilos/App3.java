package hilos;
public class App3 {
    public static void main(String[] args) {
        Thread t1 = new Hilo();
        Thread t2 = new Hilo();
        Thread t3 = new Hilo();
        Thread t4 = new Hilo();

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
