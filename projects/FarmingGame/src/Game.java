
/*
 * Tyler Patterson
 * March 2017
 */

import java.util.Scanner;

public class Game {

	static Scanner scan = new Scanner(System.in);
	int choice;
	int value;
	double balance;
	double debt;
	double debtCheck;
	double assetsCheck;
	boolean doubleMoney = false;
	boolean christmasBonus = false;
	boolean wheatCut = false;
	boolean bankrupt = false;
	static int position;
	boolean valid = false;
	Die d = new Die();
	Deck deck = new Deck();
	Player player = new Player();
	Account account = new Account();
	int acres = (account.getCow() + account.getHay() + account.getFruit() + account.getGrain());

	public static void main(String[] args) {

		int answer;
		System.out.println("Welcome To The Farming Game!");
		System.out.println("Would You Like To Start A New Game?");
		System.out.print("Please Entre 1 for Yes, or 2 for No: ");
		answer = scan.nextInt();
		System.out.println();
		if (answer == 1) {
			Game game = new Game();
			game.run();
		} else {
			System.out.println("Okay, Have A Good Day!");
		}

	}

	public void run() {
		do {
				System.out.println("Main Menu:");
				System.out.println("1. View Account.");
				System.out.println("2. Roll Die.");
				System.out.println("3. Quit Game.");
				System.out.print("Please Entre Your Choice: ");
				choice = scan.nextInt();
				switch (choice) {
				case 1:
					viewAccount();
					break;
				case 2:
					rollAndMove();
					break;
				case 3:
					quit();
					break;
				default:
					break;
				}
		} while (!valid);

	}

	public void viewAccount() {
		System.out.println();
		System.out.println(account);
		System.out.println();
		System.out.println("Account Menu: ");
		System.out.println("1. Get A Loan or Pay Off Debt.");
		System.out.println("2. Sell Assets.");
		System.out.println("3. Buy Assets.");
		System.out.println("4. Main Menu.");
		System.out.print("Please Entre Your Choice: ");
		choice = scan.nextInt();
		System.out.println();
		switch (choice) {
		case 1:
			System.out.println("Would You Like To: ");
			System.out.println("1. Get A Loan.");
			System.out.println("2. Pay Off Debt.");
			System.out.println("3. Back.");
			System.out.print("Please Entre Your Choice: ");
			choice = scan.nextInt();
			System.out.println();
			if (choice == 1) {
				System.out.print("Please Entre How Much Money You Would Like To Loan: ");
				choice = scan.nextInt();
				System.out.println();
				debtCheck += choice;
				if (debtCheck > 50000) {
					System.out.println("I'm Sorry, You Cannot Exceed The Amount Of $50,000.");
					System.out.println();
				} else {
					debt += choice;
					balance += choice;
					account.setDebt(debt);
					account.setBalance(debt);
					System.out.println();
				}
			} else if (choice == 2) {
				System.out.println("You Owe " + debt);
				System.out.print("Please Entre How Much You Would Like To Pay Back: ");
				choice = scan.nextInt();
				if (choice > balance) {
					System.out.println("I'm Sorry, You Cannot Pay That Much Money Back.");
					System.out.println();
				} else {
					debt -= choice;
					balance -= choice;
					account.setDebt(debt);
					account.setBalance(balance);
					System.out.println();
					debtCheck = debt;
				}
			} else if (choice == 3) {
				viewAccount();
			} else {
				run();
			}
			break;
		case 2:
			System.out.println(account.showAssets());
			System.out.println("Which Asset Would You Like To Sell?");
			System.out.println("1. Cows");
			System.out.println("2. Fruit");
			System.out.println("3. Hay");
			System.out.println("4. Grain");
			System.out.println("5. Back");
			System.out.print("Please Entre Your Choice: ");
			choice = scan.nextInt();
			System.out.println();
			if (choice == 5) {
				viewAccount();
			} else if (choice == 1) {
				System.out.println("You Have " + account.getCow() + " Cows.");
				System.out.println("How Much Would You Like To Sell?");
				System.out.println("1. 5");
				System.out.println("2. 10");
				System.out.println("3. 20");
				System.out.println("4. 50");
				System.out.print("Please Entre Your Choice: ");
				choice = scan.nextInt();
				System.out.println();
				if (choice > account.getCow()) {
					System.out.println("I'm Sorry, You Don't Have That Many Cows.");
					viewAccount();
				} else {
					if (choice == 1) {
						System.out.println("Okay You Sold 5 Cows.");
						balance += (5 * 500);
						account.setCow((account.getCow() - 5));
					} else if (choice == 2) {
						System.out.println("Okay You Sold 10 Cows.");
						balance += (10 * 500);
						account.setCow((account.getCow() - 10));
					} else if (choice == 3) {
						System.out.println("Okay You Sold 20 Cows.");
						balance += (20 * 500);
						account.setCow((account.getCow() - 20));
					} else if (choice == 4) {
						System.out.println("Okay You Sold 50 Cows.");
						balance += (50 * 500);
						account.setCow((account.getCow() - 50));
					}
				}
			} else if (choice == 2) {
				System.out.println("You Have " + account.getFruit() + " Acres Of Fruit.");
				System.out.println("How Much Would You Like To Sell?");
				System.out.println("1. 5");
				System.out.println("2. 10");
				System.out.println("3. 20");
				System.out.println("4. 50");
				System.out.print("Please Entre Your Choice: ");
				choice = scan.nextInt();
				System.out.println();
				if (choice > account.getFruit()) {
					System.out.println("I'm Sorry, You Don't Have That Many Acres Of Fruit.");
					viewAccount();
				} else {
					if (choice == 1) {
						System.out.println("Okay You Sold 5 Acres Of Fruit.");
						balance += 25000;
						account.setFruit((account.getFruit() - 5));
					} else if (choice == 2) {
						System.out.println("Okay You Sold 10 Acres Of Fruit.");
						balance += (2 * 25000);
						account.setFruit((account.getFruit() - 10));
					} else if (choice == 3) {
						System.out.println("Okay You Sold 20 Acres Of Fruit.");
						balance += (4 * 25000);
						account.setFruit((account.getFruit() - 20));
					} else if (choice == 4) {
						System.out.println("Okay You Sold 50 Acres Of Fruit.");
						balance += (10 * 25000);
						account.setFruit((account.getFruit() - 50));
					}
				}
			} else if (choice == 3) {
				System.out.println("You Have " + account.getHay() + " Acres Of Hay.");
				System.out.println("How Much Would You Like To Sell?");
				System.out.println("1. 5");
				System.out.println("2. 10");
				System.out.println("3. 20");
				System.out.println("4. 50");
				System.out.print("Please Entre Your Choice: ");
				choice = scan.nextInt();
				System.out.println();
				if (choice > account.getHay()) {
					System.out.println("I'm Sorry, You Don't Have That Many Acres Of Hay.");
					viewAccount();
				} else {
					if (choice == 1) {
						System.out.println("Okay You Sold 5 Acres Of Hay.");
						balance += (5 * 2000);
						account.setHay((account.getHay() - 5));
					} else if (choice == 2) {
						System.out.println("Okay You Sold 10 Acres Of Hay.");
						balance += (10 * 2000);
						account.setHay((account.getHay() - 10));
					} else if (choice == 3) {
						System.out.println("Okay You Sold 20 Acres Of Hay.");
						balance += (20 * 2000);
						account.setHay((account.getHay() - 20));
					} else if (choice == 4) {
						System.out.println("Okay You Sold 50 Acres Of Hay.");
						balance += (50 * 2000);
						account.setHay((account.getHay() - 50));
					}
				}
			} else if (choice == 4) {
				System.out.println("You Have " + account.getGrain() + " Acres Of Grain.");
				System.out.println("How Much Would You Like To Sell?");
				System.out.println("1. 5");
				System.out.println("2. 10");
				System.out.println("3. 20");
				System.out.println("4. 50");
				System.out.print("Please Entre Your Choice: ");
				choice = scan.nextInt();
				System.out.println();
				if (choice > account.getGrain()) {
					System.out.println("I'm Sorry, You Don't Have That Many Acres Of Grain.");
					viewAccount();
				} else {
					if (choice == 1) {
						System.out.println("Okay You Sold 5 Acres Of Grain.");
						balance += (5 * 2000);
						account.setGrain((account.getGrain() - 5));
					} else if (choice == 2) {
						System.out.println("Okay You Sold 10 Acres Of Grain.");
						balance += (10 * 2000);
						account.setGrain((account.getGrain() - 10));
					} else if (choice == 3) {
						System.out.println("Okay You Sold 20 Acres Of Grain.");
						balance += (20 * 2000);
						account.setGrain((account.getGrain() - 20));
					} else if (choice == 4) {
						System.out.println("Okay You Sold 50 Acres Of Grain.");
						balance += (50 * 2000);
						account.setGrain((account.getGrain() - 50));
					}
				}
			}
			account.setBalance(balance);
			assetsCheck = ((account.getCow() * 500) + (account.getFruit() * 5000) + (account.getGrain() * 2000) + (account.getHay() * 2000));
			break;
		case 3:
			System.out.println("*Insert Buy Assets*");
			break;
		case 4:
			System.out.println();
			run();
			break;
		default:
			break;
		}
	}
	
	public void rollAndMove() {
		value = d.roll();
		System.out.println();
		System.out.println("You Rolled A " + value);
		position += value;
		player.setPosition(position);
		System.out.println(deck.getCard());
		System.out.println();
		if (position == 0 || position == 9 || position == 12 || position == 17 || position == 19 || position == 20
				|| position == 23 || position == 24) {
			System.out.println();
			collectMoney();
		} else if (position == 1 || position == 4 || position == 15 || position == 18) {
			System.out.println();
			drawOTB();
		} else if (position == 3 || position == 13 || position == 21 || position == 22) {
			System.out.println();
			drawFF();
		} else if (position == 2 || position == 5 || position == 8 || position == 10) {
			System.out.println();
			payMoney();
		} else if (position == 6 || position == 16) {
			System.out.println();
			movePlayer();
		} else if (position == 7) {
			System.out.println();
			doubleMoney = true;
		} else if (position == 10 || position == 11 || position == 12 || position == 13 || position == 14 || position == 15 ||position == 16 || position == 17 ||position == 18 || position == 19 || position == 20 || position == 21 || position == 22 || position == 23 || position == 24) {
			drawOpExpense();
		}
	}

	public void collectMoney() {
		if (christmasBonus = true && position == 0) {
			balance += 6000;
			account.setBalance(balance);
		} else if (position == 9 || position == 12 || position == 17 || position == 19 || position == 20
				|| position == 23 || position == 24) {
			balance += 500;
			account.setBalance(balance);
		} else if (position == 11) {
			balance += 1000;
			account.setBalance(balance);
		}
	}

	public void drawOTB() {
		System.out.println(deck.oTB());
	}

	public void drawFF() {
		System.out.println(deck.farmersFate());
		if (deck.farmersFate().equals(25)) {
			balance -= 7000;
			account.setBalance(balance);
		} else if (deck.farmersFate().equals(29)) {
			balance -= (100 * acres);
			account.setBalance(balance);
		} else if (deck.farmersFate().equals(31)) {
			balance -= (1000 * account.getFruit());
			account.setBalance(balance);
		} else if (deck.farmersFate().equals(34)) {
			wheatCut = true;
		} else if (deck.farmersFate().equals(26)) {
			balance += 2000;
			account.setBalance(balance);
		} else if (deck.farmersFate().equals(27) && account.getCow() >= 1) {
			balance += 2000;
			account.setBalance(balance);
		} else if (deck.farmersFate().equals(28)) {
			balance += 1000;
			account.setBalance(balance);
		} else if (deck.farmersFate().equals(30) && account.getCow() >= 1) {
			account.setCow(0);
		} else if (deck.farmersFate().equals(32) || deck.farmersFate().equals(33)) {
			position = 2;
			christmasBonus = false;
		}
	}

	public void payMoney() {
		if (position == 2 && account.getCow() >= 1) {
			balance -= 500;
			account.setBalance(balance);
		} else if (position == 8 || position == 10) {
			balance -= 500;
			account.setBalance(balance);
		} else if (position == 5) {
			balance -= 2000;
			account.setBalance(balance);
		}
	}

	public void movePlayer() {
		if (position == 6) {
			position = 2;
		} else if (position == 16) {
			position = 4;
			balance += 5000;
			account.setBalance(balance);
		}
	}
	
	public void drawOpExpense() {
		System.out.println(deck.operateExpense());
		if (deck.operateExpense().equals(46) || deck.operateExpense().equals(47) || deck.operateExpense().equals(51)) {
			balance -= 500;
			account.setBalance(balance);
		} else if (deck.operateExpense().equals(49) && account.getCow() > 1) {
			balance -= 500;
			account.setBalance(balance);
		} else if (deck.operateExpense().equals(48) || deck.operateExpense().equals(52)) {
			balance -= 1500;
			account.setBalance(balance);
		} else if (deck.operateExpense().equals(50)) {
			balance -= 3000;
			account.setBalance(balance);
		} else if (deck.operateExpense().equals(53)) {
			balance -= 1000;
			account.setBalance(balance);
		} else if (deck.operateExpense().equals(54) && account.getCow() > 1) {
			balance -= (account.getCow() * 100);
			account.setBalance(balance);
		} else if (deck.operateExpense().equals(45)) {
			balance -= (100 * acres);
			account.setBalance(balance);
		}
	}
	
	public void bankrupt() {
		System.out.println("You Went Bankrupt! Sorry!");
		System.out.println("Would You Like To Play Again?");
		System.out.println("1. Yes");
		System.out.println("2. No");
		System.out.println("Please Entre Your Choice: ");
		choice = scan.nextInt();
		if (choice == 1) {
			run();
		} else {
			quit();
		}
	}

	public void quit() {
		valid = true;
		System.out.println();
		System.out.println("Thank You For Playing The Game!");
	}

}
