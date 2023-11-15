package lista;

/*
 * Fuente: https://www.deltapci.com/java-listas-enlazadas-simples/
 */
public class Nodo {
    private Object elemento;
    private Nodo siguiente;

    public Nodo(Object elemento, Nodo siguiente) {
        this.elemento = elemento;
        this.siguiente = siguiente;
    }

    public Object getElemento() {
        return elemento;
    }
    public Nodo getSiguiente() {
        return siguiente;
    }
    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}