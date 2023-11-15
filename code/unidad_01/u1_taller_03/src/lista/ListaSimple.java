package lista;

/*
 * Fuente: https://www.deltapci.com/java-listas-enlazadas-simples/
 */
public class ListaSimple {

    private Nodo primero;
    private int n;

    public ListaSimple() {
        this.primero = null;
        this.n = 0;
    }

    public int getN() {
        return n;
    }
    public Nodo getPrimero() {
        return primero;
    }
    public void setN(int n) {
        this.n = n;
    }
    public void setPrimero(Nodo primero) {
        this.primero = primero;
    }

    public void insertarPrimero(Object elemento) {
        Nodo nuevo = new Nodo(elemento, this.primero);
        if (estaVacia()) {
            this.primero = nuevo;
        } else {
            nuevo.setSiguiente( this.primero );
            this.primero = nuevo;
        }
        this.n++;
    }

    public Boolean estaVacia() {
        return this.getPrimero() == null;
    }

    public void insertarUltimo(Object elemento) {
        Nodo nuevo = new Nodo(elemento, null);
        if (estaVacia()) {
            this.primero = nuevo;
        } else {
            Nodo actual = this.primero;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
            this.n++;
        }
    }

    public Boolean buscar(Object elemento) {
        Boolean encontrado = false;
        Nodo actual = this.primero;

        while(actual != null && !encontrado) {
            Object contenido = actual.getElemento();
            if (contenido.equals(elemento)) {
                encontrado = true;
                break;
            } else {
                actual = actual.getSiguiente();
            }
        }
        return encontrado;
    }

    public void eliminar(Object elemento) {
        if (estaVacia()) {
            System.out.println("Lista esta vacia.");
        } else if (buscar(elemento)) {
            Nodo actual = this.primero;
            if (actual.getElemento().equals(elemento)) {
                this.primero = this.primero.getSiguiente();
            } else {
                while (actual.getSiguiente()!=null && !actual.getSiguiente().getElemento().equals(elemento)) {
                    actual = actual.getSiguiente();
                }
                Nodo siguiente = actual.getSiguiente().getSiguiente();
                actual.setSiguiente(siguiente);
            }
            this.n--;
        }
    }

    public void actualizar(Object elemento) {
        if (estaVacia()) {
            System.out.println("Lista esta vacia.");
        } else if (buscar(elemento)) {
            Nodo actual = this.primero;
            while (!actual.getElemento().equals(elemento)) {
                actual = actual.getSiguiente();
            }
            actual.setElemento(elemento);
        }
    }

    public void eliminar() {
        this.primero = null;
        this.n = 0;
    }

    public void listar() {
        if (!estaVacia()) {
            Nodo actual = this.primero;
            while(actual != null) {
                System.out.println( actual.getElemento() );
                actual = actual.getSiguiente();
            }
        }
    }
}