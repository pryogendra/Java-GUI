import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class ColorDemo extends JFrame implements ActionListener
{
    JFrame f;
    JPanel p;
    JButton b1;
    ColorDemo()
    {
        f=new JFrame("Color Handling");
        p=new JPanel();
        b1=new JButton("Click me");
        p.add(b1);
        b1.addActionListener(this);
        f.add(p);
        f.setVisible(true);
        f.setSize(400,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae)
    {
        Random r=new Random();
        Color rc=new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256));
        b1.setBackground(rc);
        Color rc1=new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256));
        p.setBackground(rc1);
    }

    public static void main(String[] args)
    {
        new ColorDemo();
    }
}
