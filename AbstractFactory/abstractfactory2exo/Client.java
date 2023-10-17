package abstractfactory2exo;

public class Client {
public static void main(String[] agrs) {
	ProduitFactory produitfactory1= new ProduitFactory1();
	ProduitFactory produitfactory2= new ProduitFactory2();
	ProduitFactory produitfactory3= new ProduitFactory3();
	ProduitA produitA= null;
	ProduitB produitB=null;
	System.out.println("UTILISATION DE LA PREMIERE FABRIQUE");
	produitA= produitfactory1.getProduitA();
	produitB=produitfactory1.getProduitB();
	produitA.methodeA();
	produitB.methodeB();
	System.out.println("UTILISATION DE LA DEUXIEME FABRIQUE");
	produitA=produitfactory2.getProduitA();
	produitB=produitfactory2.getProduitB();
	produitA.methodeA();
	produitB.methodeB();
	System.out.println("UTILISATION DE LA TROISIEME FABRIQUE");
	produitA=produitfactory3.getProduitA();
	produitB=produitfactory3.getProduitB();
	produitA.methodeA();
	produitB.methodeB();
}
}
