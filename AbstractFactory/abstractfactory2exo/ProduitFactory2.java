package abstractfactory2exo;

public class ProduitFactory2 implements ProduitFactory{
	public ProduitA getProduitA() {
		return new ProduitA2();
	};
	public ProduitB getProduitB() {
		return new ProduitB2();
	}
}
