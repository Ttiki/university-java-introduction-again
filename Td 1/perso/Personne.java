package perso;

public class Personne {
    private String nom;
    private String prenom;
    private int age;

    // Static Attribute
    private static int lastID = 0;

    //
    public Personne(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    // Static Methods
    public static int getNombrePersonnes() {
        return lastID;
    }

    public String toString() {
        String output = "Nom: " + nom + ",Age:" + age;
        return output;
    }

    public String getNom() {
        return this.nom;
    }

    public int getAge() {
        return this.age;
    }

    public String getPreno() {
        return this.prenom;
    }

    public void setNom(String nomPersonne) {
        nom = nomPersonne;
    }

    public void setAge(int agePersonne) {
        if (agePersonne > 0 && agePersonne < 100)
            age = agePersonne;
        else
            age = 0;
    }

    public void SetPrenom(String prenom) {
        this.prenom = prenom;
    }
}