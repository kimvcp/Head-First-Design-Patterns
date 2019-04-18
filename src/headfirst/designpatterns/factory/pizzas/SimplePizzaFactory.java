package headfirst.designpatterns.factory.pizzas;

public class SimplePizzaFactory {
	private static SimplePizzaFactory instance;

	private SimplePizzaFactory(){}

	public static synchronized SimplePizzaFactory getInstance() {
		if( instance == null){
			instance = new SimplePizzaFactory();
		}
		return instance;
	}

	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		} else if (type.equals("clam")) {
			pizza = new ClamPizza();
		} else if (type.equals("veggie")) {
			pizza = new VeggiePizza();
		} 
		return pizza;
	}
}
