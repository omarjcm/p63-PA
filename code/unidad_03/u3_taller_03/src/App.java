import java.awt.Color;
import java.awt.Rectangle;

public class App {
    public static void main(String[] args) {
        Ventana ventana = new Ventana("Hilos con Graficos");
        Panel panel = new Panel();
        ventana.add(panel);

        Objeto obj1 = new Objeto(Color.RED, new Rectangle(0,0, 400, 400), 1);
        Objeto obj2 = new Objeto(Color.PINK, new Rectangle(10,0, 400, 400), 2);

        panel.agregarObjeto(obj1);
        panel.agregarObjeto(obj2);

        ventana.setVisible(true);
    }
}