package builderexample;

public class MonteurPizzaPiquante extends MonteurPizza{
	
		Pizza pizza = new Pizza();
		 
	public void monterPate() {
		pizza.setPate("feuilletee");
	}
	public void monterSauce() {
		pizza.setSauce("piquente");
	}
	public void monterGarniture() {
		pizza.setGarniture("pepperoni+salami");
		
	}
	public Pizza getPizza() {
		monterPate();
		monterSauce();
		monterGarniture();
		pizza.print();
		return pizza;
	}
}
