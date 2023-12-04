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
    public boolean equals(Object elemento) {
        if (elemento instanceof Libro) {
            return ((Libro)this.contenido).getContenido();
        } else if (elemento instanceof Electronico) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Articulo{" + "contenido=" + contenido + '}';
    }
}

