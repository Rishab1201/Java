import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class slip4a extends Applet implements ActionListener {
    private Button addButton, subButton, mulButton, divButton;
    private TextField numField1, numField2, resultField;

    public void init() {
        setLayout(new FlowLayout());

        numField1 = new TextField(10);
        numField2 = new TextField(10);
        resultField = new TextField(15);
        resultField.setEditable(false);

        addButton = new Button("+");
        subButton = new Button("-");
        mulButton = new Button("*");
        divButton = new Button("/");

        addButton.addActionListener(this);
        subButton.addActionListener(this);
        mulButton.addActionListener(this);
        divButton.addActionListener(this);

        add(numField1);
        add(numField2);
        add(addButton);
        add(subButton);
        add(mulButton);
        add(divButton);
        add(resultField);
    }

    public void actionPerformed(ActionEvent e) {
        int num1 = Integer.parseInt(numField1.getText());
        int num2 = Integer.parseInt(numField2.getText());
        String operator = e.getActionCommand();
        int result = 0;

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    resultField.setText("Error");
                    return;
                }
                break;
        }

        resultField.setText(Integer.toString(result));
    }
}
