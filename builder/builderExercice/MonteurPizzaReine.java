package builderExercice;


public class MonteurPizzaReine extends MonteurPizza {
	Pizza pizza = new Pizza();

	public void monterPate() {
		pizza.setPate("croisée");
	}
	public void monterSauce() {
		pizza.setSauce("douce");
	}
	public void monterGarniture() {
		pizza.setGarniture("jambon+champignon");
	}
	public Pizza getPizza() {
		monterPate();
		monterSauce();
		monterGarniture();
		pizza.print();
		return pizza;
	}
}
