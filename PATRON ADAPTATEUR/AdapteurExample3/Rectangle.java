package AdapteurExample3;

public class Rectangle {
	public float longeur;
	public float largeur;
	public float setLong(float x) {
		this.longeur=x;
		return longeur;
	}
	public float setLarg(float y) {
		this.largeur=y;
		return largeur;
	}
	public float perimetre() {
		return (longeur+largeur)*2;
	}
	public float aire() {
		return longeur*largeur;
	}
}

