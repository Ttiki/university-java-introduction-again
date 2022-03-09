import people.EnsChercheurArray;
import people.IChercheur;
import people.Personne;

public class HelloChercheurArray {

    public static void main(String[] args) {
        // implementing array

        IChercheur ensChercheur = new EnsChercheurArray("Dupont", "Jean", 20);

        System.out.println("Hello Chercheur ARRAY " + ensChercheur);
        System.out.println();

        ensChercheur.ajuterPublication("Using Interfaces in Java, Dupont J., 2021");

        System.out.println("Hello Chercheur ARRAY " + ensChercheur);
        System.out.println();

        System.out.println("Total de personnes: " + Personne.getNombrePersonnes());

    }
}