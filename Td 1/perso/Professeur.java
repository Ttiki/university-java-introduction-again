package perso;

public class Professeur extends Personne {
    private int id;
    private String domain;
    private double salary;
    private String placeOfWork;
    private String adress;

    public Professeur(String nomPersonne, String prenomPersonne, int agePersonne, int id, String domain, double salary, String placeOfWork, String adress) {
        super(nomPersonne, prenomPersonne, agePersonne);
        this.id = id;
        this.domain = domain;
        this.salary = salary;
        this.placeOfWork = placeOfWork;
        this.adress = adress;
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDomain() {
        return this.domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPlaceOfWork() {
        return this.placeOfWork;
    }

    public void setPlaceOfWork(String placeOfWork) {
        this.placeOfWork = placeOfWork;
    }

    public String getAdress() {
        return this.adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String toString() {
        return (super.toString() + ", salary: " + salary);
    }
}