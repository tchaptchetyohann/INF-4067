package CompositeFichiers;

import java.util.ArrayList;
import java.util.List;


public class Repertoires extends Dossiers {
	private List<Dossiers> dossier=new ArrayList<Dossiers>();
public Repertoires(String nom) {
	super(nom);
} 
public void decrire() {
System.out.println(nom);
for(Dossiers dos:dossier) {
	dos.decrire();
}
}
public void ajouter(Dossiers dos) {
	
	dossier.add(dos);
}
public void supprimer(Dossiers dos) {
	dossier.remove(dos);
}
public List<Dossiers> obtenir() {
	return dossier;
}
}
