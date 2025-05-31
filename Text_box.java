import javax.swing.*;
import java.awt.event.*;


public class Text_box extends JFrame implements ActionListener{

    JTextField tf;
    JButton b;
    JLabel lb;

    Text_box(){
        setSize(500,500);
        setLocation(500,200);
        setDefaultCloseOperation(3);
        setLayout(null);
        
        tf=new JTextField();
        b=new JButton("Press");
        lb=new JLabel();

        tf.setBounds(20,50,200,30);
        b.setBounds(230,50,100,30);
        lb.setBounds(100,150,300,300);
        
        add(tf);
        add(b);
        add(lb);

        b.addActionListener(this);

        
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
            System.out.println(tf.getText());
            lb.setText(tf.getText());
    }

    public static void main(String[] args) {
        new Text_box();
    }
}