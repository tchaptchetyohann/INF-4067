package adapterpatron1;

public class DocumentPDF implements Document{
 Composant outilpdf = new Composant();
	
	public int setContenu(int contenu){
		return outilpdf.pdfFixeContenu(contenu);
	};
public int dessine(){
	return 0;
};
public int imprimer(){
	return 0;
};
}
