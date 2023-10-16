
import java.util.*;
import javax.swing.*;
public class slip30a {
    public static void main(String []args)
    {
        JFrame frame=new JFrame("simple GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200,150);

        JLabel label=new JLabel("hello swing");
        JButton button=new JButton("click me");

        frame.add(label);
        frame.add(button);

       
        frame.setVisible(true);
    }
}
