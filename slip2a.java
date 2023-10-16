import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class slip2a extends JFrame {
    private JTextField positionTextField;

    public slip2a() {
        setTitle("Mouse Event Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        positionTextField = new JTextField(20);
        positionTextField.setEditable(false);

        JPanel contentPane = new JPanel();
        contentPane.setLayout(new FlowLayout());
        contentPane.add(positionTextField);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                positionTextField.setText("Mouse Clicked at: (" + x + ", " + y + ")");
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                positionTextField.setText("Mouse Moved to: (" + x + ", " + y + ")");
            }
        });

        setContentPane(contentPane);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            slip2a demo = new slip2a();
            demo.setVisible(true);
        });
    }
}
