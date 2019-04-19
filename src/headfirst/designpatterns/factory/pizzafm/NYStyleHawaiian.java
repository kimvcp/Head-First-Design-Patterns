package headfirst.designpatterns.factory.pizzafm;

public class NYStyleHawaiian extends Pizza {

	public NYStyleHawaiian() {
		name = "NY Style Hawaiian";
		dough = "Regular Crust";
		sauce = "Ketchup Sauce";
 
		toppings.add("Fresh Mozzarella");
		toppings.add("Ham");
		toppings.add("Pineapple");
	}
}
