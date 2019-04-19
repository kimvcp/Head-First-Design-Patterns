package headfirst.designpatterns.state.gumballstate;

public class JackpotState implements State {
	GumballMachine gumballMachine;

	public JackpotState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	public void insertQuarter() {
		System.out.println("Please wait, we're already giving you a Gumball");
	}

	public void ejectQuarter() {
		System.out.println("Please wait, we're already giving you a Gumball");
	}

	public void turnCrank() {
		System.out.println("Turning again doesn't get you another gumball!");
	}

	public void dispense() {
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() == 0) {
			gumballMachine.setState(gumballMachine.getSoldOutState());
		} else {
			if (gumballMachine.getCount() > 0) {
				gumballMachine.setState(gumballMachine.getNoQuarterState());
			} else {
				System.out.println("Oops, out of gumballs!");
				gumballMachine.setState(gumballMachine.getSoldOutState());
			}
		}
	}

	public void tryMyLuck() {
		System.out.println("Entering Try My Luck...");
		if (Math.random() * 100 <= 1) {
			System.out.println("YOU WON A JACKPOT! You got twenty gumballs for your quarter");
			for (int i = 0; i < 20; i++) {
				if (gumballMachine.getCount() > 0) {
					gumballMachine.releaseBall();
				}else {
					System.out.println("Sorry, out of gumballs!");
					gumballMachine.setState(gumballMachine.getSoldOutState());
					break;
				}
			}		
		} else {
			System.out.println("Sorry, you get nothing");
		}

	}

	public void refill() {
	}

	public String toString() {
		return "dispensing a gumball";
	}

}
