package compositeTexte;

import java.util.ArrayList;
import java.util.List;

import CompositeFichiers.Text;

public class Section extends Texte{
	protected String titre;
	protected String preambule;
	private List<Texte> texte=new ArrayList<Texte>();
	public Section(String titre,String preambule) {
		
		super(titre,preambule);
	}
	public  int longueur(){
		return preambule.length();
	}
	public  void ajout(Texte txt) {
		  texte.add(txt);
		  
	}
	public  void retrait(int index){
		 texte.remove(index);
	}
}
