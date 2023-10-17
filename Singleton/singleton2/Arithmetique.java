package singleton2;


public class Arithmetique {
	private static Arithmetique instance =null;
	//D'autres attributs, classiques et non static
	private int x;
	private int y;
	private String name;
	private Arithmetique() {
		super();
	}
	private Arithmetique(int x,int y) {
		this.x=x;
		this.y=y;
		this.name="math";
	}
	public static Arithmetique getInstance() {
		if(instance==null) {
			instance= new Arithmetique();
		}
		return instance;
	}
	//methode renvoyant une instance de class singleton
	public static Arithmetique getInstance(int x,int y) {
		if(instance==null) {
			instance =new Arithmetique(x,y);
		}
		return instance;
	}
	public int somme(int x,int y) {
		return x+y;
	}
	public int sustraction(int x, int y) {
		return x-y;
	}
	public float moyenne(int x, int y) {
		return somme(x,y)/2;
	}
	public int multiplication(int x, int y) {
		return x*y;
	}
	public void affiche() {
		System.out.println("\n Je suis une instance mes valeurs sont:x ="+this.x+"et y="+this.y);
	}
	//redefinir la methode clone pour empecher son utilisation
	@Override
	public Object clone() throws 
	CloneNotSupportedException{
		throw new CloneNotSupportedException();
	}
}
