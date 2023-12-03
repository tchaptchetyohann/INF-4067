package Decorator;

public class DecorateurCuseurHorizontal extends DecorateurFenetre {
	public  DecorateurCuseurHorizonztal(Fenetre fenetre) {
		super(fenetre);
	}
public void dessiner() {
	fenetreDecoree.dessiner();
	System.out.println("dessiner du coté horizontale");
}
public void decrire() {
	fenetreDecoree.decrire();
	System.out.println("decrire cote gauche");
}

}
