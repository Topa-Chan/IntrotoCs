import java.util.Scanner;

/*
 * Tyler Patterson
 * Assignment 4
 * This program prompts the user for a PIN and then displays a menu for a bank account, 
 * it lets the user withdraw or deposit money, will not letting the user excceed the amount in the account.
 */
public class MyATM {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Please Entre Your PIN Number: ");
		int pin = scan.nextInt();
		int bankpin = 1234;
		boolean valid = false;
		float balance = 500;
		double deposit = 0;
		double withdraw = 0;
		if (pin == bankpin) {
			do {
			System.out.println("1. Account Balance");//menu
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Quit");
			System.out.print("Please Entre Your Choice: ");
			int choice = scan.nextInt();
			System.out.println();
			switch (choice) {
			case 1: 
				System.out.println("Your Balance Is: $" + balance);
				System.out.println();
				break;
			case 2:
				System.out.print("Please Entre The Amount You Would Like To Deposit: ");
				deposit = scan.nextDouble();
				balance += deposit;
				System.out.println("Your Current Balance Is Now: $" + balance);
				System.out.println();
				break;
			case 3:
				System.out.println("Please Entre Your Amount In Increments of Twenties.");
				System.out.print("Please Entre The Amount You Would Like To Withdraw: ");
				withdraw = scan.nextDouble();
				if (withdraw%20 == 0) {
					if (withdraw <= balance) {
						balance -= withdraw;
						System.out.println("Your Current Balance Is Now: $" + balance);						
					} else {
						System.out.println("I'm Sorry, You Do Not Have That Much Money, Please Try Again.");
					}
				} else {
					System.out.println("Please Entre Your Amount In Increments of Twenties.");
				}
				System.out.println();
				break;
			case 4:
				System.out.println();
				System.out.println("Okay, Have A Good Day.");
				System.out.println("Goodbye.");
				valid = true;
				System.out.println();
				break;
			default: 
			}
			} while (!valid);
		} else {
			System.out.println("We Apologize, That Is The Wrong PIN Number.");
			System.out.println("Have A Good Day!");
		}

	}

}
