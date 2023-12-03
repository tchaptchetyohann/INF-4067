package Decorator;

public class Client {
public static void main(String[] args) {
	FenetreSimple dessin= new Dessin();
	Fenetre b= new DecorateurCuseurHorizontal(dessin);
	b.dessiner();
}
}
 