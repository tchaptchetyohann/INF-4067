package PatronBridgeForme;
public abstract class Form {
	Couleur couleur;
public Form(Couleur couleur) {
	this.couleur= couleur;
	}

public abstract void colorier();
}
