package headfirst.designpatterns.factory.pizzas;

public class HawaiianPizza extends Pizza {
	public HawaiianPizza() {
		name = "Hawaiian Pizza";
		dough = "Regular Crust";
		sauce = "Marinara Pizza Sauce";
		toppings.add("Fresh Mozzarella");
		toppings.add("Parmesan");
	}
}
