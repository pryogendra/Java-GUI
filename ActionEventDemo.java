import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ActionEventDemo extends JFrame implements ActionListener
{
    JFrame f;
    ActionEventDemo()
    {
        JFrame f=new JFrame("Event Handling");
        JPanel p=new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton b1=new JButton("Click me");
        p.add(b1);
        b1.addActionListener(this);
        f.add(p);
        f.setVisible(true);
        f.setSize(400,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae)
    {
        JOptionPane.showMessageDialog(f,"Button Clicked...");
    }

    public static void main(String[] args) {
        new ActionEventDemo();
    }
}
