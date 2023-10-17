package EXAMPLEFTACTORY;
public class Factory {
public static final int Type_Produit1=1;
public static final int Type_Produit2=2;
public static final int Type_Produit3=3;

public Produit getProduit(int TypeProduit) {
	Produit produit=null;
	switch (TypeProduit) {
	case(Type_Produit1):
		produit=new Produit1();
	break;
	case(Type_Produit2):
		produit=new Produit2();
	break;
	
	  throw new IllegalArgumentException("Type de produit inconnu");
	}
	return produit;
}
}