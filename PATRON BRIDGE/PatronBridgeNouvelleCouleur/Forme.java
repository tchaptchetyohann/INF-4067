package PatronBridgeNouvelleCouleur;

public abstract class Forme {
Couleur color;
public Forme(Couleur couleur) {
	this.color=couleur;
}
public abstract void colorier();
}
