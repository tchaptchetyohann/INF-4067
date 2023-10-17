package builderExercice;


public class MonteurPizzaLocale extends MonteurPizza {
	Pizza pizza = new Pizza();
	 
	public void monterPate() {
		pizza.setPate("FeuilleMacabo");
	}
	public void monterSauce() {
		pizza.setSauce("Saucejaune");
	}
	public void monterGarniture() {
		pizza.setGarniture("escargot");
		
	}
	public Pizza getPizza() {
		monterPate();
		monterSauce();
		monterGarniture();
		pizza.print();
		return pizza;
	}
}
