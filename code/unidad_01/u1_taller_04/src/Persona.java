public class Persona {
    private String nombre;
    private String apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    public String getApellido() {
        return apellido;
    }
    public String getNombre() {
        return nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean esIgual(Object elemento) {
        Persona obj = (Persona) elemento;
        return (this.nombre == obj.getNombre()) && (this.apellido == obj.getApellido());
    }

    @Override
    public String toString() {
        return this.apellido + " " + this.nombre;
    }
}
