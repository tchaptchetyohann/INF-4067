package compositeTexte;

public class Client {
public static void main(String[] args) {
	Section section= new Section("une section","");
	Texte paragraph=new Paragraphe("paragraph1","paul mange");
	section.ajout(paragraph);
	System.out.println(section);
} 
}
