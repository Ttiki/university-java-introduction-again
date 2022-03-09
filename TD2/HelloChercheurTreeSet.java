import people.*;
public class HelloChercheurTreeSet {
  
  public static void main(String[] args){

    // implementing TreeSet 

    IChercheur ensChercheurTreeSet = new EnsChercheurTreeSet("Dupont", "Jean", 20);
    System.out.println("Hello Chercheur3 TreeSet "+ensChercheurTreeSet);
    System.out.println();

    ensChercheurTreeSet.ajuterPublication("Using Interfaces in Java, Dupont J., 2021");

    System.out.println("Hello Chercheur3 TreeSet "+ensChercheurTreeSet);
    System.out.println();

    System.out.println("Total de personnes: " +Personne.getNombrePersonnes());

  }
}