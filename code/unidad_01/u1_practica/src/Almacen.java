import java.util.ArrayList;
import java.util.List;

public class Almacen<T> {
    private List<Articulo<T>> articulos = new ArrayList<>();

    public void agregarArticulo(Articulo<T> articulo) {
        articulos.add(articulo);
    }

    public List<Articulo<T>> getArticulos() {
        return articulos;
    }

    public Articulo<T> buscarArticulo(String codigo) {
        for (Articulo<T> articulo : this.articulos) {
            if (((Articulo<Libro>)articulo.getContenido()).getCodigo().equals(codigo) {
                return articulo;
            }
        }
        return null;
    }

    // Método para imprimir todos los artículos
    public void imprimirInventario() {
        for (Articulo<T> articulo : articulos) {
            System.out.println(articulo);
        }
    }
}

