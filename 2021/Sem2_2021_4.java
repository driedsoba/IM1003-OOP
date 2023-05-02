import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ATM extends JFrame {

    private JLabel display;
    private JTextField inputField;
    private JButton subButton;

    private JButton clearButton;

    private JButton[] numButton;

    private String input = "";

    public ATM() {

        // Left panel
        Panel leftPanel = new Panel();
        leftPanel.setLayout(new BorderLayout());

        display = new JLabel("Enter the amount:");
        leftPanel.add(display, BorderLayout.NORTH);

        inputField = new JTextField("$0", 10);
        inputField.setHorizontalAlignment(JTextField.RIGHT);
        inputField.setEditable(false);
        leftPanel.add(inputField, BorderLayout.CENTER);

        subButton = new JButton("SUBMIT");
        leftPanel.add(subButton, BorderLayout.SOUTH);

        ButtonsListener listener = new ButtonsListener();

        // Right panel
        Panel rightPanel = new Panel();
        rightPanel.setLayout(new GridLayout(4, 3,3, 3));
        numButton = new JButton[10];

        for(int i = 0; i < numButton.length; i++) {
            numButton[i] = new JButton(i + "");
            numButton[i].addActionListener(listener);
        }

        for (int i = 1; i <= 9; i++) {
            rightPanel.add(numButton[i]);
        }

        clearButton = new JButton("C");
        rightPanel.add(clearButton);
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputField.setText("$0");
                input = "";
            }
        });

        // top level container
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        cp.add(leftPanel);
        cp.add(rightPanel);
        setTitle("ATM");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,100);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ATM();
            }
        });
    }

    private class ButtonsListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            input += e.getActionCommand();
            inputField.setText("$" + input);
        }
    }
}
