package interrupciones;

public class App {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread( new Interrupcion() );
        Thread t2 = new Thread( new Interrupcion() );
        t1.start();
        t2.start();
        Thread.sleep(1000);
        System.out.println("Antes de la interrupcion...");
        t1.interrupt();
        Thread.sleep(2000);
        t2.interrupt();
        System.out.println("Despues de la interrupcion...");
    }
}
