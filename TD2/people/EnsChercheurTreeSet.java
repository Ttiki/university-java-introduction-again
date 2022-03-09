package people;
import java.util.*;

public class EnsChercheurTreeSet extends Personne implements IChercheur{

  private TreeSet publications;

  public EnsChercheurTreeSet(String nomPersonne, String prenomPersonne, int agePersonne){
    super(nomPersonne, prenomPersonne, agePersonne);
    publications = new TreeSet();
  }

  public void ajuterPublication(String publication){
    publications.add(publication);
  } 

  public String getPublications(){
    String listePublications = "";
    Iterator it = publications.iterator();

    while(it.hasNext()){
      String pub = (String) it.next();
      listePublications = listePublications +"\n"+ pub;
    }
    return listePublications;   
  }

  public String toString(){
    return (super.toString() + "\n Liste de publications : " + getPublications());

  }

}
