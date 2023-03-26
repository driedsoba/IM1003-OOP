import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// AWT GUI program that inherits from top-level container java.awt.Frame
public class AWTAccumulator extends Frame {

    // TextField declaration, Label to be anonymous
    private TextField tfInput;  // input TextField
    private TextField tfOutput; // output TextField
    private int sum = 0;    // Accumulated sum, init to 0


    // Constructor to set up 4 GUI Components and 1 event handler
    public AWTAccumulator() {
        setLayout(new GridLayout(2, 2));
        // "super" Frame (Container) sets layout to GridLayout of 2 rows and 2 columns.

        // 1st component
        add(new Label("Enter an Integer: ")); // "super" Frame adds an anonymous Label

        // 2nd component
        tfInput = new TextField(10);    // Construct TextField
        add(tfInput);                          // "super" Frame adds TextField

        tfInput.addActionListener(new TFInputListener());
        // "tfInput" is the source object that triggers an ActionEvent upon entered
        // The source adds an anonymous instance of TFInputListener as an ActionEvent
        // listener, which provides an ActionEvent handler method actionPerformed().
        // Hitting "enter" on tfInput invokes actionPerformed()

        // 3rd component
        add(new Label("The Accumulated Sum is: "));     // "super" Frame adds an anonymous Label

        // 4th component
        tfOutput = new TextField(10);    // Construct TextField
        tfOutput.setEditable(false);            // read-only
        add(tfOutput);                          // "super" Frame adds TextField

        // formatting "super" Frame layout
        setTitle("AWT Accumulator");            // "super" Frame sets title
        setSize(350, 120);          // "super" Frame sets initial window size
        setVisible(true);                       // "super" Frame shows
    }


    // Define an inner class to handle the input TextField
    // ActionEvent listener implements ActionListener interface
    private class TFInputListener implements ActionListener {
        // ActionEvent handler - Called back upon hitting "enter" key on TextField

        @Override
        public void actionPerformed(ActionEvent evt) {

            // Get the String entered in TextField tfInput, convert to int
            int numIn = Integer.parseInt(tfInput.getText());    // getText() method from TextField class
            sum += numIn;       // Accumulate numbers entered into sum
            tfInput.setText("");    // Clear input TextField
            tfOutput.setText(sum + ""); // convert int to String
        }
    }
}
