package abstractfactory2exo;

public class ProduitFactory3 implements ProduitFactory {
public ProduitA getProduitA() {
	return new ProduitA3();
}
public ProduitB getProduitB() {
	return new ProduitB3();
}
}
