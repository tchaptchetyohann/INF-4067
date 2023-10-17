package EXAMPLEFTACTORY;

public class Client {
	 public static void main(String[] args) {
		
		 Factory produitFactory = new Factory();
		 Produit produit= null;
		 produit = produitFactory.getProduit(produitFactory.Type_Produit1);
		 produit.MethodA();
		 produit = produitFactory.getProduit(produitFactory.Type_Produit2);
		 produit.MethodA();
		 
		 
	 }

}
