package hilos;
public class Hilo extends Thread {
    @Override
    public void run() {
        System.out.println("Mi nombre es " + Thread.currentThread().getName() + " y no soy terrorista.");
    }

    public static void execute() {
        System.out.println("Mi nombre es " + Thread.currentThread().getName() + " y no soy terrorista.");
    }
}
