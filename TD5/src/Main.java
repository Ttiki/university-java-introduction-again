import ui.Comunica;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        System.out.println("Début du programme");

        Comunica cw = new Comunica();
        cw.buildUI();
        Comunica cw2 = new Comunica();


        try {
            cw.setLinkedComunica(cw2);

        } catch (IOException e) {
            e.printStackTrace();
        }

        //cw.SENDButton.addActionListener(e->CommunicationWindow.buttonPressed(cw));
    }
}
