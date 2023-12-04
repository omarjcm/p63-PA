import java.awt.Graphics;
import java.awt.Color;
import java.awt.Rectangle;

public class Objeto implements Runnable {

    private int x, y, dx, dy;
    private final Color color;
    private final Rectangle limites;

    public Objeto(Color color, Rectangle limites, int paso) {
        this.color = color;
        this.limites = limites;
        this.x = limites.x;
        this.y = limites.y;
        this.dx = paso;
        this.dy = paso;
    }

    public void dibujar(Graphics g) {
        g.setColor(this.color);
        g.fillOval(this.x, this.y, 40, 40);
    }

    public void mover() {
        if (this.x + this.dx < this.limites.x || this.x + this.dx > this.limites.width) {
            this.dx = -this.dx;
        }
        if (this.y + this.dy < this.limites.y || this.y + this.dy > this.limites.height) {
            this.dy = -this.dy;
        }
        this.x += this.dx;
        this.y += this.dy;
    }

    @Override
    public void run() {
        while (true) {
            mover();
            try {
                Thread.sleep(20);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}