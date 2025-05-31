import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class mouse_line extends JFrame implements MouseListener {

    Integer x1 = null, y1 = null, x2 = null, y2 = null;
    int flag = 0;

    mouse_line() {

        setLocation(500, 200);
        setSize(500, 500);
        setLayout(null);
        setDefaultCloseOperation(2);
        addMouseListener(this);
        setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
           
        if(flag==0){
            x1=e.getX();
            y1=e.getY();
        }
        if(flag==1){
            x2=e.getX();
            y2=e.getY();
        }

        flag=(flag+1)%2;
        repaint();
    }

    public void paint(Graphics g) {

        super.paint(g);
        g.setFont(new Font("Arial", 1, 10));
        
        if(x1!=null && x2!=null){
            g.drawLine(x1,y1,x2,y2);
        }

    }

    public static void main(String[] args) {
        new mouse_line();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

}
