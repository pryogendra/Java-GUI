import javax.swing.*;
import java.awt.event.*;

public class MouseEventDemo extends JFrame implements MouseListener, MouseMotionListener
{
    JFrame f;
    JPanel p;
    JTextField t;
    MouseEventDemo()
    {
        f=new JFrame("Mouse Event ");
        p=new JPanel();
        t=new JTextField(30);
        p.add(t);
        f.add(p);
        p.addMouseListener(this);
        p.addMouseMotionListener(this);
        f.setVisible(true);
        f.setSize(500,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void mousePressed(MouseEvent me)
    {
        t.setText("Mouse Pressed");
    }
    public void mouseReleased(MouseEvent me)
    {
        t.setText("Mouse Released");
    }
    public void mouseEntered(MouseEvent me)
    {
        t.setText("Mouse Entered");
    }
    public void mouseMoved(MouseEvent me)
    {
        t.setText("Mouse Moved");
    }
    public void mouseExited(MouseEvent me)
    {
        t.setText("Mouse Exited");
    }
    public void mouseDragged(MouseEvent me)
    {
        t.setText("Mouse Dragged");
    }
    public void mouseClicked(MouseEvent me)
    {
        t.setText("Mouse Clicked on position ("+me.getX()+","+me.getY()+")");
    }

    public static void main(String[] args)
    {
        new MouseEventDemo();
    }
}
