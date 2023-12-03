package CompositeFichiers;

public class Pdf extends Fichier{
	public String type;
	public String nom;
	public Pdf(String nom) {
		super(nom);
		this.nom =nom;

		}
	public void decrire() {
		this.type="PDF";
		System.out.println(nom+"."+this.type);
	}
}
