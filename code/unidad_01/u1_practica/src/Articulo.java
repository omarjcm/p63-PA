public class Articulo<T> {
    private T contenido;

    public Articulo(T contenido) {
        this.contenido = contenido;
    }

    public T getContenido() {
        return contenido;
    }

    public void setContenido(T contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Articulo{" + "contenido=" + contenido + '}';
    }
}

