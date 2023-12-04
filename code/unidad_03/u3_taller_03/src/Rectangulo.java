import java.awt.Color;
import java.awt.Point;

public class Rectangulo extends FiguraGeometrica {
    private int alto;
    private int ancho;

    public Rectangulo(Color color, Point posicion, int alto, int ancho) {
        super(color, posicion);
        this.alto = alto;
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }
    public int getAncho() {
        return ancho;
    }
    public void setAlto(int alto) {
        this.alto = alto;
    }
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
}