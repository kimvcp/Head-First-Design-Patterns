package headfirst.designpatterns.state.gumballstate;

public class GumballMachine {
 
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	State jackpotState;
 
	State state;
	int count = 0;
	boolean hasQuarter;
 
	public GumballMachine(int numberGumballs) {
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		jackpotState = new JackpotState(this);
		hasQuarter = false;

		this.count = numberGumballs;
 		if (numberGumballs > 0) {
			state = noQuarterState;
		} else {
			state = soldOutState;
		}
	}
 
	public void insertQuarter() {
		state.insertQuarter();
	}
 
	public void ejectQuarter() {
		state.ejectQuarter();
	}
 
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}
	public void tryMyLuck() {
		state.tryMyLuck();
	}
 
	void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0) {
			count = count - 1;
		}
	}
 
	int getCount() {
		return count;
	}
 
	void refill(int count) {
		this.count += count;
		System.out.println("The gumball machine was just refilled; it's new count is: " + this.count);
		state.refill();
	}

	void setState(State state) {
		this.state = state;
	}
    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }
    public State getJackpotState(){
    	return jackpotState;
    }
 
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\n______________________________________________________________________________\n");
		result.append("\n\t\tMighty Gumball, Inc.");
		result.append("\n\t\tJava-enabled Standing Gumball Model #2004");
		result.append("\n\t\tInventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("\t\tMachine is " + state + "\n");
		result.append("______________________________________________________________________________\n");
		return result.toString();
	}
}
