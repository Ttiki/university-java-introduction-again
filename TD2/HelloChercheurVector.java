import people.EnsChercheurVector;
import people.IChercheur;
import people.Personne;

public class HelloChercheurVector {

    public static void main(String[] args) {

        // implementing vector

        IChercheur ensChercheurVector = new EnsChercheurVector("Dupont", "Jean", 20);
        System.out.println("Hello Chercheur2 VECTOR " + ensChercheurVector);
        System.out.println();

        ensChercheurVector.ajuterPublication("Using Interfaces in Java, Dupont J., 2021");

        System.out.println("Hello Chercheur2 VECTOR " + ensChercheurVector);
        System.out.println();

        System.out.println("Total de personnes: " + Personne.getNombrePersonnes());

    }
}