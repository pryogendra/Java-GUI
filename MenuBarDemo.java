import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuBarDemo extends JFrame implements ActionListener
{
    JFrame f;
    MenuBarDemo()
    {
        JFrame f=new JFrame("MouseEvent Handling");
        JMenuBar jmb=new JMenuBar();
        JMenu m1=new JMenu("File");
        JMenuItem mil=new JMenuItem("Open");
        m1.add(mil);
        jmb.add(m1);
        f.setJMenuBar(jmb);
        mil.addActionListener(this);
        f.setVisible(true);
        f.setSize(400,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae)
    {
        JOptionPane.showMessageDialog(f,"File Open Clicked");
    }

    public static void main(String[] args) {
        new MenuBarDemo();
    }
}
