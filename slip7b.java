import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;

public class slip7b{
    public static void main( String[] args)
    {
        Frame frame =new Frame("cOLLEGE LABEL");
        frame.setSize(400, 100);
        frame.setLayout(null);

        Label label=new Label("Dr. D Y pATIL", 0);
        label.setBounds(50, 30, 300, 30);
        label.setBackground(Color.RED);
        label.setFont(new Font ("Arial",Font.PLAIN,20));
        label.setAlignment(Label.CENTER);
        frame.add(label);
        frame.setVisible(true);
       
    }
}