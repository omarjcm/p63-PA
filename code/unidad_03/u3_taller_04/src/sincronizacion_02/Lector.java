package sincronizacion_02;

public class Lector implements Runnable {

    private Mensaje mensaje;

    public Lector(Mensaje mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public void run() {
        String nombre = Thread.currentThread().getName();

        synchronized(mensaje) {
            System.out.println(nombre);
            try {
                System.out.println(mensaje.getMensaje());
                mensaje.wait();
                System.out.println(nombre + " - " + mensaje.getMensaje());
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
