package CompositeFichiers;

public abstract class Dossiers {
	protected String type;
	protected String nom;
	public Dossiers(String nom) {
		this.nom=nom;
	}
	public abstract void decrire();
}
