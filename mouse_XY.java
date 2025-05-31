import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class mouse_XY extends JFrame implements MouseMotionListener {

    int x, y;
 
    mouse_XY() {

        setLocation(500, 200);
        setSize(500, 500);
        setLayout(null);
        setDefaultCloseOperation(2);

        this.addMouseMotionListener(this);

        setVisible(true);
    }

    public void mouseMoved(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        repaint();
    }

    public void paint(Graphics g) {
        super.paint(g);

        g.setFont(new Font("Arial", 1, 10));
        g.drawString("X : " + x + " Y : " + y, 10, 480);

    }

    public static void main(String[] args) {
        new mouse_XY();
    }

    public void mouseDragged(MouseEvent e) {
    }
}
