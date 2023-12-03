package CompositeFichiers;

public class Client {
public static void main(String[] args) {
	Repertoires repertoire1=new Repertoires("Repertoire1");
	Repertoires repertoire2=new Repertoires("Repertoire2");
	repertoire1.ajouter(repertoire2);
	repertoire1.ajouter(new Pdf("fichier"));
	repertoire1.ajouter(new Pdf("fichier1"));
	repertoire2.ajouter(new Text("fichier2"));
	repertoire2.ajouter(new Text("fichier2"));
	repertoire1.decrire();
}
}
