import com.sun.webkit.ColorChooser;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class File_Chooser extends JFrame implements ActionListener
{
    JFrame f;
    JPanel p;
    JButton b;
    JTextArea t;
    JFileChooser chooser=new JFileChooser();
    File_Chooser()
    {
        f=new JFrame("Color Selection");
        Container c=f.getContentPane();
        c.setLayout(new BorderLayout());
        b=new JButton("Open File");
        t=new JTextArea(50,80);
        JScrollPane jsp=new JScrollPane(t);
        c.add(jsp,BorderLayout.CENTER);
        c.add(b,BorderLayout.SOUTH);
        b.addActionListener(this);
        f.setVisible(true);
        f.setSize(400,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae)
    {
        int result=chooser.showOpenDialog(null);
        File fileobj=chooser.getSelectedFile();
        if(result==JFileChooser.APPROVE_OPTION)
        {
            try
            {
                BufferedReader r=new BufferedReader(new FileReader(chooser.getSelectedFile()));
                StringBuilder c=new StringBuilder();
                String l;
                while((l=r.readLine())!=null)
                {
                    c.append(l).append("\n");
                }
                t.setLineWrap(true);
                t.setText(c.toString());
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(this,"Error reading the file", "ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }


    }

    public static void main(String[] args)
    {
        new File_Chooser();
    }
}
