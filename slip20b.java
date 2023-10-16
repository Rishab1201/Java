import java.awt.*;
import java.awt.event.*;
public class slip20b extends Frame {
    public slip20b()
    {
        Label l;
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });

        Font f=new Font("Arial",Font.BOLD,20);
        setFont(f);
        Color c=Color.red;
        setBackground(c);
        setTitle("TYBBA-CA");
        setSize(500,500);
        setLayout(new FlowLayout());
        setVisible(true);
    }

    public static void main(String[]args)
    {
        slip20b ob=new slip20b();
    }
}
