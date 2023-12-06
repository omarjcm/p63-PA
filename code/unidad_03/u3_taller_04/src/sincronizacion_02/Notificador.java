package sincronizacion_02;

public class Notificador implements Runnable {

    private Mensaje mensaje;

    public Notificador(Mensaje mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public void run() {
        
    }
}
