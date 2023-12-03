package PatronBridgeNouvelleforme;

public class Cercle extends Forme {
	public  Cercle(Couleur couleur) {
		super(couleur);
	}
	public void colorier() {
		System.out.println("Cercle de couleur ");
		color.remplircouleur();
	}
	
}
