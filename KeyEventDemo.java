import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyEventDemo extends JFrame implements KeyListener
{
    JFrame f;
    JPanel p;
    JTextField t;
    KeyEventDemo()
    {
        f=new JFrame("Key Event ");
        p=new JPanel();
        t=new JTextField(20);
        p.add(t);
        f.add(p);
        t.addKeyListener(this);
        f.setVisible(true);
        f.setSize(400,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void keyPressed(KeyEvent ke)
    {
        System.out.println("Key Pressed");
    }
    public void keyReleased(KeyEvent ke)
    {
        System.out.println("Key Released");
    }
    public void keyTyped(KeyEvent ke)
    {
        System.out.println("Key Typed "+ke.getKeyChar());
    }

    public static void main(String[] args)
    {
        new KeyEventDemo();
    }
}
