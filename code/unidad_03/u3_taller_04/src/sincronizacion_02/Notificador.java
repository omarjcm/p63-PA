package sincronizacion_02;

import java.util.concurrent.TimeUnit;

public class Notificador implements Runnable {

    private Mensaje mensaje;

    public Notificador(Mensaje mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public void run() {
        String nombre = Thread.currentThread().getName();

        synchronized(mensaje) {
            try {
                TimeUnit.MILLISECONDS.sleep(100);
                mensaje.setMensaje("Hola desde el notificador");
                mensaje.notifyAll();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
