package singleton2;


public class TestArithmetique {
	public static void main(String[] args) {
		int som=Arithmetique.getInstance().somme(2,5);
		int sub=Arithmetique.getInstance().sustraction(2,5);
		int mul=Arithmetique.getInstance().multiplication(2,5);
		System.out.println("som"+som);
		Arithmetique s2= Arithmetique.getInstance(5,9);
		s2.affiche();
}
	}
