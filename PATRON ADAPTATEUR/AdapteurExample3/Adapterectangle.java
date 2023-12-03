package AdapteurExample3;

public class Adapterectangle implements ICarre {
public float cote;
Rectangle monRect=new Rectangle();
public float perimetre() {
	monRect.setLong(cote);
	monRect.setLarg(cote);
	return monRect.perimetre();
}
public float aire() {
	monRect.setLong(cote);
	monRect.setLarg(cote);
	return monRect.aire();
}
}
