public class Electronico implements Elemento {
    private String codigo;
    private String nombre;
    private String marca;

    public Electronico(String nombre, String marca) {
        this.nombre = nombre;
        this.marca = marca;
    }

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getMarca() {
        return marca;
    }
    public String getNombre() {
        return nombre;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Marca: " + this.marca + ", Nombre: " + this.nombre;
    }

}

