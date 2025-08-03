import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;

public class Change_bg extends JFrame implements ActionListener {

    JButton RB;
    JButton GB;
    JButton BB;
    Color currentColor = Color.WHITE;

    Change_bg() {
        setSize(500, 500);
        setLocation(600, 200);
        setDefaultCloseOperation(3);
        setLayout(null);

        RB = new JButton("RED");
        GB = new JButton("GREEN");
        BB = new JButton("BLUE");

        RB.setBounds(50, 50, 100, 100);
        GB.setBounds(150, 50, 100, 100);
        BB.setBounds(250, 50, 100, 100);

        RB.addActionListener(this);
        GB.addActionListener(this);
        BB.addActionListener(this);

        RB.setForeground(Color.RED);
        GB.setForeground(Color.GREEN);
        BB.setForeground(Color.BLUE);

        add(RB);
        add(GB);
        add(BB);

        setVisible(true);
    }

  public void actionPerformed(ActionEvent e) {
        if (e.getSource() == RB) {
            getContentPane().setBackground(Color.RED);
        } else if (e.getSource() == GB) {
            getContentPane().setBackground(Color.GREEN);
        } else if (e.getSource() == BB) {
            getContentPane().setBackground(Color.BLUE);
        }
    }


    public static void main(String[] args) {
        new Change_bg();
    }
}