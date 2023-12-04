import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel extends JPanel implements ActionListener  {

    private final List<Objeto> objetos = new ArrayList<Objeto>();
    private Timer timer;

    public Panel() {
        setLayout(null);
        timer = new Timer(16, this);
        timer.start();
    }

    public void agregarObjeto(Objeto objeto) {
        objetos.add(objeto);
        new Thread(objeto).start();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (Objeto objeto : objetos) {
            objeto.dibujar(g);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}