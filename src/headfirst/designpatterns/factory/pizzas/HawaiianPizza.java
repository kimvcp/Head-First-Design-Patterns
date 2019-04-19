package headfirst.designpatterns.factory.pizzas;

public class HawaiianPizza extends Pizza {
	public HawaiianPizza() {
		name = "Hawaiian Pizza";
		dough = "Regular Crust";
		sauce = "Ketchup Sauce";
		toppings.add("Fresh Mozzarella");
		toppings.add("Ham");
		toppings.add("Pineapple");
	}
}
