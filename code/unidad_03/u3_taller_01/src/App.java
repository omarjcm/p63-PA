public class App {
    public static void main(String[] args) throws Exception {
        Thread t1 = new Thread( new Runnable() {
            @Override
            public void run() {
                System.out.println("Mi nombre es " + Thread.currentThread().getName() + " y no soy terrorista.");
            }
        } );
        Thread t2 = new Thread( new Runnable() {
            @Override
            public void run() {
                System.out.println("Mi nombre es " + Thread.currentThread().getName() + " y no soy terrorista.");
            }
        } );

        t1.start();
        t2.start();
    }
}
