// File Name : Comunica.java
// File description : description
// Author(s) : author
// Date of creation : Dim 20 Fév 2022
// License : license
//
// Supplementary information : infos
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Comunica {
    // CONSTANTES - no -
    // ATTRIBUTES - no -
    private BufferedWriter writer;
    private BufferedReader reader;

    public JPanel panel1;
    public JLabel lmessrec;
    public JTextField txtToSend;
    public JButton bSend;
    public JButton bReceive;
    public JTextArea textRec;
    private JLabel lmesssend;

    private Comunica linkedComunica;

    // CONSTRUCTOR (singleton) - no -
    public Comunica() {

        //Event lsiteners
        bSend.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Send button pressed!");
                try {
                    System.out.println(writer);
                    writer.write(txtToSend.getText());
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            }
        });
        bReceive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Receive  button pressed!");

                try {
                    textRec.setText(reader.readLine());
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });


    }

    public static void buildUI() {
        JFrame frame = new JFrame("Comunica");
        frame.setContentPane(new Comunica().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.pack();
        frame.setVisible(true);
    }

    public void setLinkedComunica(Comunica comunica) throws IOException {
        this.linkedComunica = comunica;
        this.linkedComunica.linkedComunica = this;

        //Set the linked comunica writer and readers.
        this.linkedComunica.writer = new BufferedWriter(new FileWriter("res/A2B.txt"));
        this.linkedComunica.reader = new BufferedReader(new FileReader("res/B2A.txt"));

        //Set this writer and readers.
        this.writer = new BufferedWriter(new FileWriter("res/B2A.txt"));
        this.reader = new BufferedReader(new FileReader("res/A2B.txt"));
        System.out.println(this.linkedComunica.writer);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public BufferedWriter getWriter() {
        return writer;
    }

    public BufferedReader getReader() {
        return reader;
    }

    // ENCAPSULATION METHODS - no -
    // USUAL METHODS - no -
    // SPECIFIC METHODS - no -
}
