package perso;

public class Personne {
    // Static Attribute
    private static int lastID = 0;
    private String nom;
    private String prenom;
    private int age;

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

    public void setNom(String nomPersonne) {
        nom = nomPersonne;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int agePersonne) {
        if (agePersonne > 0 && agePersonne < 100)
            age = agePersonne;
        else
            age = 0;
    }

    public String getPreno() {
        return this.prenom;
    }

    public void SetPrenom(String prenom) {
        this.prenom = prenom;
    }
}