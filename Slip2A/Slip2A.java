import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Slip2A extends JFrame implements MouseListener,MouseMotionListener
{
  JTextField t1;
  public Slip2A()
  {
    t1=new JTextField(25);
    Font f=new Font("Arial",Font.BOLD,20);
    t1.setFont(f);
    setLayout(new FlowLayout());
    setVisible(true);
    setSize(700,700);
    add(t1);
    addMouseListener(this);
    addMouseMotionListener(this);
  }
  public void mouseClicked(MouseEvent e)
  {
    t1.setText("X Position :"+e.getX()+"Y Position :"+e.getY());
  }
  public void mousePressed(MouseEvent e){}
   public void mouseReleased(MouseEvent e){}
   public void mouseEntered(MouseEvent e){}
   public void mouseExited(MouseEvent e){}
    public void mouseMoved(MouseEvent e)
  {
    t1.setText("X Position :"+e.getX()+"Y Position :"+e.getY());
  }
  public void mouseDragged(MouseEvent e){}
  public static void main(String args[])
  {
    Slip2A ob=new Slip2A();
  }
}