public class App {
    public static void main(String[] args) {
        Ventana ventana = new Ventana("Hilos con Graficos");
        Panel panel = new Panel();
        ventana.setVisible(true);
        ventana.add(panel);
    }
}