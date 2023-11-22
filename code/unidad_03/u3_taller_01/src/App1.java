public class App1 {
    public static void main(String[] args) {
        Runnable tarea = new Tarea();
        Thread t1 = new Thread( tarea );
        Thread t2 = new Thread( tarea );
        Thread t3 = new Thread( tarea );
        Thread t4 = new Thread( tarea );
        Thread t5 = new Thread( tarea );
        Thread t6 = new Thread( tarea );

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
    }
}
