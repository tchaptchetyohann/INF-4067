package builderExercice;



public class Directeur {
	public MonteurPizza monteurpizzapiquante= new MonteurPizzaPiquante();
	public MonteurPizza monteurpizzareine= new MonteurPizzaReine();
	public MonteurPizza monteurpizzalocale= new MonteurPizzaLocale();

	public void construire() {
		monteurpizzapiquante.getPizza();
		monteurpizzareine.getPizza();
		monteurpizzalocale.getPizza();
	}
}
