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

    // Método para imprimir todos los artículos
    public void imprimirInventario() {
        for (Articulo<T> articulo : articulos) {
            System.out.println(articulo);
        }
    }
}

