package PatronBridgeNouvelleforme;

public class Client {
	public static void main(String[] args) {
		Forme rectangle = new Rectangle(new Rouge());
		rectangle.colorier();
		Forme carre = new Carre(new Bleu());
		carre.colorier();
		Forme cercle= new Cercle(new Rouge());
		cercle.colorier();
	}
	

}
