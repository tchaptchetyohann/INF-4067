package Decorator;

public class DecorateurCuseurVertical extends DecorateurFenetre{
	public  DecorateurCuseurVertical(Fenetre fenetre) {
		super(fenetre);
	}
public void dessiner() {
	fenetreDecoree.dessiner();
}
public void decrire() {
	fenetreDecoree.decrire();
}

}
