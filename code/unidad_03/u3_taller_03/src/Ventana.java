import javax.swing.JFrame;

public class Ventana extends JFrame {
    public Ventana(String title) {
        this.setTitle(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
    }
}
