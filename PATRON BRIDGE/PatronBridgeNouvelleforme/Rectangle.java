package PatronBridgeNouvelleforme;


public class Rectangle extends Forme {
	public  Rectangle(Couleur couleur) {
		super(couleur);
	}
	public void colorier() {
		System.out.println("Rectangle de couleur ");
		color.remplircouleur();
	}
	
}
