import java.awt.Color;
import java.awt.Point;

public class FiguraGeometrica {
    private Color color;
    private Point posicion;

    public FiguraGeometrica(Color color, Point posicion) {
        this.color = color;
        this.posicion = posicion;
    }

    public Color getColor() {
        return color;
    }
    public Point getPosicion() {
        return posicion;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public void setPosicion(Point posicion) {
        this.posicion = posicion;
    }
    public int getX() {
        return (int) this.posicion.getX();
    }
    public int getY() {
        return (int) this.posicion.getY();
    }
}
