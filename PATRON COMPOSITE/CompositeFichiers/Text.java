package CompositeFichiers;

public class Text extends Fichier {
	//public String type;
	//public String nom;
	public Text(String nom) {
	super(nom);
	this.nom =nom;
	
	}
	public void decrire() {
		this.type="text";
		System.out.println(nom+"."+this.type);
	}
}
