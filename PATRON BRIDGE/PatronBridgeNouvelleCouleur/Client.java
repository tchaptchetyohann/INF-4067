package PatronBridgeNouvelleCouleur;

public class Client {
	
public static void main(String[] args) {
	
	
	Couleur rouge= new Rouge();
	Forme rectangle = new Rectangle(rouge);
	Couleur bleu = new Bleu();
	Forme cercle=new Cercle(bleu);
	Couleur blanc =new Blanc();
	Forme rectangle2=new Rectangle(blanc);

	rectangle.colorier();
	cercle.colorier();
	rectangle2.colorier();
}
	
}
