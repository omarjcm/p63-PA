package sincronizacion_02;

public class Lector implements Runnable {
    
    private Mensaje mensaje;

    public Lector(Mensaje mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public void run() {

    }
}
