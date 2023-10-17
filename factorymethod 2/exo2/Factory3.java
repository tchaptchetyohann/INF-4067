package exo2;

public class Factory3 extends Factory{
	protected  Produit createProduit() {
		return new Produit3();
	}
	public  Produit getProduit() {
		return createProduit();
	};

}
