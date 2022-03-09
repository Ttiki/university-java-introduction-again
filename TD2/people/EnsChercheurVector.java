package people;
import java.util.*;



public class EnsChercheurVector extends Personne implements IChercheur{

  private Vector publications;

  public EnsChercheurVector(String nomPersonne, String prenomPersonne, int agePersonne){
    super(nomPersonne, prenomPersonne, agePersonne);
    publications = new Vector();
  }

  public void ajuterPublication(String publication){
    publications.add(publication);
  } 

  public String getPublications(){
    String listePublications = "";
    
    for (int i = 0; i < publications.size(); i++){
      String pub = (String) publications.elementAt(i);
      listePublications = listePublications +"\n"+ pub;
    }
    return listePublications;   
  }

  public String toString(){
    return (super.toString() + "\n Liste de publications : " + getPublications());

  }

}
