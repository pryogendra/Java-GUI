import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SelectionEventDemo extends JFrame implements ActionListener
{
    JFrame f;
    JComboBox jc;
    SelectionEventDemo()
    {
        JFrame f=new JFrame("SelectionEvent Handling");
        String[] items={"Apple","Banana","Orange"};
        jc=new JComboBox(items);
        JPanel jp=new JPanel();
        jc.addActionListener(this);
        jp.add(jc);
        f.add(jp);
        f.setVisible(true);
        f.setSize(400,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae)
    {
        String s=(String)jc.getSelectedItem();
        JOptionPane.showMessageDialog(f,"Selected "+s);
    }

    public static void main(String[] args) {
        new SelectionEventDemo();
    }
}
