package headfirst.designpatterns.factory.pizzafm;

public class ChicagoStyleHawaiian extends Pizza {

	public ChicagoStyleHawaiian() {
		name = "Chicago Style Hawaiian";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
 
		toppings.add("Shredded Mozzarella Cheese");
		toppings.add("Ham");
		toppings.add("Spinach");
		toppings.add("Eggplant");
		toppings.add("Pineapple");
	}
	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
