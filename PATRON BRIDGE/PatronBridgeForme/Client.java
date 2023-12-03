package PatronBridgeForme;

public class Client {
public static void main(String[] agrs) {
	Couleur colorRouge = new Rouge();
	Form rectangle=new Rectangle(colorRouge);
	rectangle.colorier();
	Form cercle=new Cercle(new Bleu());
	cercle.colorier();
}
}
