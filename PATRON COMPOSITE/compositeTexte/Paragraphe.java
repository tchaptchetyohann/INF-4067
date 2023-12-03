package compositeTexte;
 
public class Paragraphe extends Texte{
	protected String titre;
	protected String preambule;
	public Paragraphe(String titre, String preambule) {
		super(titre,preambule);
	}
	public  int longueur(){
		return preambule.length();
	}
	
}
