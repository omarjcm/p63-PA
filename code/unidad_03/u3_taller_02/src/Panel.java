import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel extends JPanel implements ActionListener {

    private Point p1;
    private Point p2;
    private int dx;
    private int dy;    

    public Panel() {
        this.p1 = new Point(20,40);
        //this.p2 = new Point(60,10);

        this.dx = 5;
        this.dy = 5;

        Timer tiempo = new Timer(100, this);
        tiempo.start();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Rectangulo obj1 = new Rectangulo(Color.RED, this.p1, 30, 70);

        g.setColor(obj1.getColor());
        g.fillRect(obj1.getX(), obj1.getY(), obj1.getAncho(), obj1.getAlto());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.p1.x += this.dx;

        repaint();
    }
}
