package exo2;

public class Factory1 extends Factory {
	protected  Produit createProduit() {
		 Produit produit=null;
		 produit= new Produit1();
		 return produit;
	}
	public  Produit getProduit() {
		return createProduit();
	};

}
