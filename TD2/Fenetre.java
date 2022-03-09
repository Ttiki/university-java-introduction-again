/**
 * Example of a Fenetre (JFrame) using awt and swing
 *
 * @author your_name
 */

import javax.swing.*;
import java.awt.*;

public class Fenetre extends JFrame {

    /** a label for the name */
    private JLabel label;
    /** a textfield for the name */
    private JTextField text;
    /** a button to perform an action: e.g. say hello (TBD) */
    private JButton button;

    /** a label **/
    private JLabel userName;

    /** Creates a Fenetre */
    public Fenetre() {
        initComponents();
    }

    static private void buttonPressed(Fenetre f, JTextField text, JLabel userName) {
        // text.getText();
        System.out.println("Bonjour : " + text.getText());
        userName.setText("Bonjour : " + text.getText());
        f.add("West", userName);
        f.label.setVisible(false);
        text.setVisible(false);
        userName.setVisible(true);

    }

    /** main entry point */
    public static void main(String[] args) {
        Fenetre f = new Fenetre();

        //Action event listenre
        f.button.addActionListener(e -> buttonPressed(f, f.text, f.userName));
    }

    /** Initializes the Fenetre components */

    private void initComponents() {
        // create the components
        // a new label with the "Nom" as value
        label = new JLabel("Nom: ");
        // a new text field with 20 columns
        text = new JTextField(20);
        userName = new JLabel("");
        // a new button identified as OK
        button = new JButton("OK");

        // configures the JFrame layout using a border layout
        this.setLayout(new BorderLayout());
        // places the components in the layout
        this.add("West", label);
        this.add("Center", text);

        this.add("East", button);
        // packs the fenetre: size is calculated
        // regarding the added components
        this.pack();
        // the JFrame is visible now
        this.userName.setVisible(false);
        this.setVisible(true);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
