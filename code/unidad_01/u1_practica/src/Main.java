public class Main {
    public static void main(String[] args) {
        Almacen<Libro> almacenDeLibros = new Almacen<Libro>();
        Almacen<Electronico> almacenDeElectronicos = new Almacen<Electronico>();

        Articulo<Libro> obj1 = new Articulo<>(new Libro("El Señor de los Anillos", "J.R.R. Tolkien"));
        almacenDeLibros.agregarArticulo(obj1);
        Articulo<Electronico> obj2 = new Articulo<>(new Electronico("Smartphone", "Samsung"));
        almacenDeElectronicos.agregarArticulo(obj2);

        almacenDeLibros.imprimirInventario();
        almacenDeElectronicos.imprimirInventario();
    }
}

