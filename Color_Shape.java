import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Color_Shape extends JFrame implements ActionListener {

    JButton red, blue, line, circle;
    Color selectedColor = null;
    Integer flag = null;

    Color_Shape() {
        setLocation(500, 200);
        setSize(500, 500);
        setDefaultCloseOperation(2);
        setLayout(null);

        red = new JButton("RED");
        blue = new JButton("BLUE");
        line = new JButton("LINE");
        circle = new JButton("CIRCLE");

        red.setBounds(50, 50, 100, 30);
        blue.setBounds(200, 50, 100, 30);
        line.setBounds(50, 100, 100, 30);
        circle.setBounds(200, 100, 100, 30);

        red.addActionListener(this);
        blue.addActionListener(this);
        line.addActionListener(this);
        circle.addActionListener(this);

        add(red);
        add(blue);
        add(line);
        add(circle);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == red)
            selectedColor = Color.red;
        if (e.getSource() == blue)
            selectedColor = Color.blue;
        if (e.getSource() == line)
            flag = 1;
        if (e.getSource() == circle)
            flag = 0;

        repaint();
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("COLOR", 10, 100);
        g.drawString("SHAPE", 10, 150);
        g.setFont(new Font("Arial", 2, 10));

        if (selectedColor != null) {
            g.setColor(selectedColor);
        }

        if (flag == 0) {
            g.drawOval(300, 300, 100, 100);
        }

        if (flag == 1) {
            g.drawLine(100, 100, 300, 300);
        }

    }

    public static void main(String[] args) {
        new Color_Shape();
    }
}
