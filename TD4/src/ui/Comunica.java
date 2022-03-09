package ui;// File Name : Comunica.java
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
    public JPanel panel1;
    public JLabel lmessrec;
    public JTextField txtToSend;
    public JButton bSend;
    public JButton bReceive;
    public JTextArea textRec;
    // CONSTANTES - no -
    // ATTRIBUTES - no -
    private JLabel lmesssend;

    // CONSTRUCTOR (singleton) - no -
    public Comunica() {

        //Event lsiteners
        bSend.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Send button pressed!");

            }
        });
        bReceive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Receive  button pressed!");

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

    // ENCAPSULATION METHODS - no -
    // USUAL METHODS - no -
    // SPECIFIC METHODS - no -
}
