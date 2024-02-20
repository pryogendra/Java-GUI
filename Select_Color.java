import com.sun.webkit.ColorChooser;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Select_Color extends JFrame implements ActionListener
{
    JFrame f;
    JPanel p;
    JButton b1;
    Select_Color()
    {
        f=new JFrame("Color Selection");
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
        Color c=JColorChooser.showDialog(this,"Select a new color : ",Color.WHITE);
        p.setBackground(c);
    }

    public static void main(String[] args)
    {
        new Select_Color();
    }
}
