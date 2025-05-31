import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;

public class CBOX extends JFrame implements ItemListener {

    String colors[]={"PLZ SELECT","RED","GREEN","BLUE","YELLOW"};
    JComboBox<String>cb;
    
    CBOX() {
        setSize(500, 500);
        setLocation(500, 200);
        setDefaultCloseOperation(3);
        setLayout(null);

        cb=new JComboBox<>(colors);
        cb.setBounds(50,50,200,50);
        add(cb);
        cb.addItemListener(this);
        setVisible(true);
    }

  @Override
    public void itemStateChanged(ItemEvent e) {

    if (e.getStateChange() == ItemEvent.SELECTED && !e.getItem().equals("PLZ SELECT")) {

        System.out.println("Selected: " + e.getItem());
    }
}

    public static void main(String[] args) {
        new CBOX();
    }

 
}