package abstractfactory2exo;

public class ProduitFactory1 implements ProduitFactory {
public ProduitA getProduitA() {
	return new ProduitA1();
};
public ProduitB getProduitB() {
	return new ProduitB1();
}
}
