public class Tarea implements Runnable {
    @Override
    public void run() {
        System.out.println("Mi nombre es " + Thread.currentThread().getName() + " y no soy terrorista.");
    }
    
}
