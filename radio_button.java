import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class radio_button extends JFrame implements ActionListener {

    JRadioButton red = new JRadioButton("RED");
    JRadioButton blue = new JRadioButton("BLUE");
    JCheckBox op = new JCheckBox("One Piece");
    JCheckBox aot = new JCheckBox("Attack on Titan");
    ButtonGroup bg = new ButtonGroup();
    JLabel fa = new JLabel("Fav Anime : ");

    radio_button() {

        setLocation(500, 200);
        setSize(500, 500);
        setLayout(null);
        setDefaultCloseOperation(2);
        setVisible(true);

        red.setBounds(50, 50, 100, 30);
        blue.setBounds(150, 50, 100, 30);
        bg.add(red);
        bg.add(blue);

        op.setBounds(50, 100, 100, 30);
        aot.setBounds(200, 100, 200, 30);
        fa.setBounds(50, 200, 500, 30);

        add(op);
        add(aot);
        add(fa);

        red.addActionListener(this);
        blue.addActionListener(this);
        op.addActionListener(this);
        aot.addActionListener(this);
        add(red);
        add(blue);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == red) {
            getContentPane().setBackground(Color.red);
        }
        if (e.getSource() == blue) {
            getContentPane().setBackground(Color.blue);
        }

        if (e.getSource() == op) {
           
            fa.setText(fa.getText()+" OP");
        }
        if (e.getSource() == aot) {
            fa.setText(fa.getText()+" AOT");
        }

    }

    public static void main(String[] args) {
        new radio_button();
    }
}
