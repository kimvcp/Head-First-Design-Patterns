package headfirst.designpatterns.state.gumballstate;

import java.util.Scanner;

public class GumballMachineTestDrive {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		GumballMachine gumballMachine = new GumballMachine(25);
		System.out.println(gumballMachine);
		while (true) {
			printString();
			String option = scanner.nextLine();
			System.out.println();

			if (option.equalsIgnoreCase("i")) {
				gumballMachine.insertQuarter();
				gumballMachine.hasQuarter = true;
				System.out.println(gumballMachine);

			} else if (option.equalsIgnoreCase("e")) {
				gumballMachine.ejectQuarter();
				System.out.println(gumballMachine);

			} else if (option.equalsIgnoreCase("d")) {
				gumballMachine.turnCrank();
				System.out.println(gumballMachine);

			} else if (option.equalsIgnoreCase("r")) {
				System.out.print("Enter amount: ");
				int number = scanner.nextInt();
				gumballMachine.refill(number);
				System.out.println(gumballMachine);

			} else if (option.equalsIgnoreCase("t")) {
				if (gumballMachine.hasQuarter) {
					gumballMachine.setState(gumballMachine.getJackpotState());
					gumballMachine.tryMyLuck();
				} else {
					System.out.println("You haven't inserted a quarter");
					System.out.println(gumballMachine);
				}

			} else if (option.equalsIgnoreCase("x")) {
				System.out.println("Exited");
				break;

			} else {
				System.out.println("Command not found");
			}
		}
	}

	public static void printString() {
		System.out.println("\nPlease select your choice");
		System.out.println("I : insert quarter");
		System.out.println("E : eject quarter");
		System.out.println("D : dispense the gumball");
		System.out.println("T : try my luck");
		System.out.println("R : refill the gumball");
		System.out.println("X : exit the program");
		System.out.print("Choice: ");
	}
}
