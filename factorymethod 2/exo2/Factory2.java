package exo2;

public class Factory2 extends Factory {
	protected  Produit createProduit() {
		return new Produit2();
	}
	public  Produit getProduit() {
		return createProduit();
	};

}
