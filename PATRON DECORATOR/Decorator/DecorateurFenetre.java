package Decorator;

public abstract class DecorateurFenetre extends Fenetre{
Fenetre fenetreDecoree= new FenetreSimple();
public  DecorateurFenetre(Fenetre fenetre) {
this.fenetreDecoree=fenetre;
}
}
