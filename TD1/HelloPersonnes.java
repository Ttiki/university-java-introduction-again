import perso.Personne;

public class HelloPersonnes {

    public static void main(String[] args) {
        Personne personne = new Personne("Dupont", "Jean", 30);
        System.out.println("Hello " + personne.toString());

        Personne autrePersonne = personne;
        System.out.println("Hello" + autrePersonne.toString());
        System.out.println("Hello" + personne.toString());

        personne.setNom("Perez");
        System.out.println("Hello" + autrePersonne.toString());
        System.out.println("Hello" + personne.toString());


    }

}