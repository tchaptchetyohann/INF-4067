package factory2method;

public class Client {
  public static void main(String[] args) {
	 Factory produitFactory1=new Factory1();
	 Factory produitFactory2=new Factory2();
	 
	 Produit produit=null;
	 System.out.println("Utilisation de la premiere fabrique");
	 produit=produitFactory1.getProduit();
	 produit.MethodA();
	 
	
	 System.out.println("Utilisation de la deuxieme fabrique");
	 produit=produitFactory2.getProduit();
	 produit.MethodA();
	 
	
  }
}
