import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// AWT Program that inherits form the top-level container java.awt.Frame
public class AWTCounter extends Frame {

    private Label lblCount;     // Declare a Label component
    private TextField tfCount;  // Declare a TextField component
    private Button btnCount;    // Declare a Button component
    private int count = 0;      // Counter value


    // Constructor to set up 3 GUI components and 1 event handler
    public AWTCounter() {
        setLayout(new FlowLayout());
        // Frame container, sets its layout to FlowLayout to arrange components
        // from left-to-right, and flow to next row from top-to-bottom

        // 3 components
        lblCount = new Label("Counter");    // Construct Label component
        add(lblCount);                          // "super" Frame container adds Label component

        tfCount = new TextField(count + "", 10);    // Construct a new text field initialized with the specified text, and hold the specified number of columns
        add(tfCount);                                           // "super" Frame container adds TextField Component

        btnCount = new Button("Count");   // Construct the Button Component
        add(btnCount);                          // "super" Frame container adds Button component

        // 1 event handler assigned to btnCount via ActionEvent listener
        BtnCountListener listener = new BtnCountListener();
        btnCount.addActionListener(listener);
        // "btnCount" is source object that triggers an ActionEvent when clicked.
        // source object adds an instance of BtnCountListener
        // clicking "count" button calls back actionPerformed()


        // formatting "super" Frame layout
        setTitle("AWT Counter");        // title
        setSize(300, 100);  // initial window size
        //setVisible(true);               // "super" Frame shows


        //To inspect Container/Component objects
        System.out.println(this);
        System.out.println(lblCount);
        System.out.println(tfCount);
        System.out.println(btnCount);
        setVisible(true);               // "super" Frame shows
        // values shown below after line 53 changes, TextField size
        System.out.println(this);
        System.out.println(lblCount);
        System.out.println(tfCount);
        System.out.println(btnCount);
    }


    /* Define inner class to handle "Count" button-click
       Note that in Java methods cannot be passed around, hence
       an inner class is used to wrap the method actionPerformed
       then passing it to the listener instance in line 34 */
    private class BtnCountListener implements ActionListener {
        // ActionEvent handler method from ActionListener interface
        // called back upon button-click

        @Override
        public void actionPerformed(ActionEvent evt) {
            ++count;    // increase counter value
            // Display counter value on TextField tfCount
            tfCount.setText(count + "");    // convert int to String
        }
    }
}