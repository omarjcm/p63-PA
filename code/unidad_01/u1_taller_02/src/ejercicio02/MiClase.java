package ejercicio02;

public class MiClase<K, V> {
    private K atributo1;
    private V atributo2;

    public MiClase(K atributo1, V atributo2) {
        this.atributo1 = atributo1;
        this.atributo2 = atributo2;
    }

    public K getAtributo1() {
        return this.atributo1;
    }

    public V getAtributo2() {
        return this.atributo2;
    }

    public V metodo(K parametro1) {
        System.out.println( parametro1 );
        return this.atributo2;
    }

    @Override
    public String toString() {
        System.out.println(this.getAtributo1());
        System.out.println(this.getAtributo2());
        return "";
    }
}