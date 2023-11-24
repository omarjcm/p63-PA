package hilos;
public class App2 {
    public static void main(String[] args) {
        Thread t1 = new Thread( () -> System.out.println("Mi nombre es " + Thread.currentThread().getName() + " y no soy terrorista.") );
        Thread t2 = new Thread( () -> System.out.println("Mi nombre es " + Thread.currentThread().getName() + " y no soy terrorista.") );
        Thread t3 = new Thread( () -> System.out.println("Mi nombre es " + Thread.currentThread().getName() + " y no soy terrorista.") );

        t1.start();
        t2.start();
        t3.start();
    }
}