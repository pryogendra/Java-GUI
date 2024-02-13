import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FocousEventDemo extends JFrame implements FocusListener
{
    JFrame f;
    JPanel p;
    JLabel l;
    JTextField t;
    FocousEventDemo()
    {
        JFrame f=new JFrame("Focous Event Handling");
        l=new JLabel("");
        JPanel p=new JPanel();
        JButton b1=new JButton("OK");
        t=new JTextField(20);
        t.setSize(20,1);
        p.add(t);
        p.add(b1);
        p.add(l);
        f.add(p);
        f.setVisible(true);
        f.setSize(400,200);
        t.addFocusListener(this);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public  void focusGained(FocusEvent fe)
    {
        l.setText("Focus Gained");
    }
    public  void focusLost(FocusEvent fe)
    {
        l.setText("Focus lost");
    }
    public static void main(String[] args)
    {
        new FocousEventDemo();
    }
}
