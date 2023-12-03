package CompositeFichiers;

public abstract class Fichier extends Dossiers {
public String type;
public String nom;
public Fichier(String nom) {
	super(nom);
}
 public abstract void decrire();

}
