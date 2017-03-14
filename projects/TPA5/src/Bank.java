import java.util.Scanner;

public class Bank {

	private Account[] accounts = new Account[15];
	private Scanner scan = new Scanner(System.in);
	private int accountCount = 0;
	private boolean valid = false;

	public Bank() {

	}
	
	public void Bank() {
		
		do {
			System.out.print("Would You Like To Add An Account? (Y/N): ");
			String answer = scan.next();
			if (answer.equals("y") || answer.equals("Y")) {
				addAccount();
			} else {
				valid = true;
				displayAccounts();
			}
		} while (!valid);
		
	}

	public void addAccount() {
		System.out.print("What Is The Name Of The Account? ");
		String name = scan.next();
		System.out.println();
		System.out.print("Which Type Of Account Would You Like To Add? (1.Savings, 2.Checking): ");
		int choice = scan.nextInt();
		System.out.println();
		System.out.print("What Is The Balance Of The Account? ");
		double balance = scan.nextDouble();
		System.out.println();
		if (choice == 1) {
			accounts[accountCount++] = new Account(name, Account.TYPE.Savings, balance);
		} else {
			accounts[accountCount++] = new Account(name, Account.TYPE.Checking, balance);
		}
	}

	public void displayAccounts() {
		for(Account account : accounts) {
			if (account != null)
				System.out.println(account);
		}
	}


}
