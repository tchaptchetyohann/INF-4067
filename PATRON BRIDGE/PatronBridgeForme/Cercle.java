package PatronBridgeForme;

public class Cercle extends Form{
	
public Cercle(Couleur couleur){
	super(couleur);
}
public void colorier() {
	System.out.println("Cercle de couleur");
	couleur.remplicouleur();
}
}
