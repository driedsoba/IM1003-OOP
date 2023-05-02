// Warning code is not fully correct

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SafeBox extends JFrame {

    private JTextField display;
    private JButton[] buttons;
    private JButton buttonsC, buttonsZero, buttonsE;
    private String lockCode = "";
    private String savedCode = "";
    private boolean isCorrect;

    public SafeBox() {

        // Top panel
        Panel topPanel = new Panel(new FlowLayout());
        display = new JTextField(30);
        display.setText("OPEN");
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setEditable(false);
        topPanel.add(display);

        // Setup common listener
        ButtonsListener listener = new ButtonsListener();

        // Bottom pane;
        Panel btmPanel = new Panel();
        btmPanel.setLayout(new GridLayout(4, 3,3,3));
        buttons = new JButton[10];

        // Initializing and adding common listener to buttons
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton(String.valueOf(i));
            buttons[i].addActionListener(listener);
        }

        // Adding Numeric Buttons correctly
        for (int i = 1; i <= 9; i++) {
            btmPanel.add(buttons[i]);
        }

        // Adding the remaining 3 buttons
        buttonsC = new JButton("C");
        buttonsZero = new JButton("0");
        buttonsE = new JButton("E");
        btmPanel.add(buttonsC);
        btmPanel.add(buttonsZero);
        btmPanel.add(buttonsE);
        buttonsC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText("");
                lockCode = "";
            }
        });
        buttonsZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lockCode += e.getActionCommand();
                display.setText(lockCode);
            }
        });
        buttonsE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (display.getText().equals("OPEN")) {
                    display.setText(lockCode);
                    display.setText("CODE SET");
                } else if (display.getText().equals("LOCKED")) {
                    display.setText(lockCode);
                    if (savedCode.equals(lockCode)) {
                        display.setText("OPEN");
                    } else {
                        display.setText("WRONG CODE");
                    }
                }
            }
        });


        // Top level container
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());
        cp.add(topPanel, BorderLayout.NORTH);
        cp.add(btmPanel, BorderLayout.CENTER);
        setTitle("Safe Box");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SafeBox();
            }
        });
    }

    private class ButtonsListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            lockCode += e.getActionCommand();
            savedCode = lockCode;
            display.setText(lockCode);
        }
    }
}

