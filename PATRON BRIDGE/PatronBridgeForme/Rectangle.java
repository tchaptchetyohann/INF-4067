package PatronBridgeForme;

public class Rectangle extends Form {
public	Rectangle(Couleur couleur) {
		super(couleur);
		}
public void colorier() {
	System.out.println("Rectangle de couleur");
	couleur.remplicouleur();
}
}
