import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AlarmClockGui extends JFrame {
    private JButton upBtn1, downBtn1, upBtn2, downBtn2;
    private JTextField displayTime;
    private Time currentTime;

    public AlarmClockGui() {

        currentTime = new Time(1, 23, 0);

        // TextField Panel (Top)
        Panel tfPanel = new Panel();
        tfPanel.setLayout(new FlowLayout());
        displayTime = new JTextField(10);
        displayTime.setText(currentTime.toString());
        displayTime.setEditable(false);
        tfPanel.add(displayTime);

        // Button Panel (Bottom)
        Panel btmPanel = new Panel();
        btmPanel.setLayout(new FlowLayout());

        // Set Hour Components
        JLabel hourLabel = new JLabel("Set Hour");
        btmPanel.add(hourLabel);
        upBtn1 = new JButton("UP");
        btmPanel.add(upBtn1);
        downBtn1 = new JButton("DN");
        btmPanel.add(downBtn1);

        // Set Minute Components
        JLabel minuteLabel = new JLabel("Set Minute");
        btmPanel.add(minuteLabel);
        upBtn2 = new JButton("UP");
        btmPanel.add(upBtn2);
        downBtn2 = new JButton("DN");
        btmPanel.add(downBtn2);

        // Top-level container
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());
        add(tfPanel, BorderLayout.CENTER);
        add(btmPanel, BorderLayout.SOUTH);
        setTitle("Alarm Clock");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 100);
        setVisible(true);

        // Allocate instance of inner class ButtonsListener
        ButtonsListener listener = new ButtonsListener();
        upBtn1.addActionListener(listener);
        downBtn1.addActionListener(listener);
        upBtn2.addActionListener(listener);
        downBtn2.addActionListener(listener);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AlarmClockGui();
            }
        });
    }

    private class ButtonsListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evt) {

            //Button source = (Button)evt.getSource();         // given in lecture notes but doesn't work

            if (evt.getSource() == upBtn1) {
                System.out.println("upBtn1 works");
                //currentTime.incrementHour();
                displayTime.setText(currentTime.toString());
            } else {
                if (evt.getSource() == downBtn1) {
                    System.out.println("downBtn1 works");
                    //currentTime.decrementHour();
                } else if (evt.getSource() == upBtn2) {
                    System.out.println("upBtn2 works");
                    //currentTime.incrementMinute();
                } else if (evt.getSource() == downBtn2) {
                    System.out.println("downBtn2 works");
                    //currentTime.decrementMinute();
                }
                displayTime.setText(currentTime.toString());
            }
        }
    }
}
