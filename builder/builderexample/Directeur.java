package builderexample;

public class Directeur {
public MonteurPizza monteurpizzapiquante= new MonteurPizzaPiquante();
public MonteurPizza monteurpizzareine= new MonteurPizzaReine();

public void construire() {
	monteurpizzapiquante.getPizza();
	monteurpizzareine.getPizza();
}

}
