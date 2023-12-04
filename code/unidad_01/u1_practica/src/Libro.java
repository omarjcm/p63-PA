public class Libro implements Elemento {
    private String codigo;
    private String titulo;
    private String autor;
    
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getAutor() {
        return autor;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Titulo: " + this.titulo + ", Autor: " + this.autor;
    }

    @Override
    public boolean comparar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'comparar'");
    }
}

