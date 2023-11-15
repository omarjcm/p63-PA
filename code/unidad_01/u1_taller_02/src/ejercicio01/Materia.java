package ejercicio01;
public class Materia {
    public String materia;

    public Materia(String materia) {
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }
    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return this.materia;
    }
}
