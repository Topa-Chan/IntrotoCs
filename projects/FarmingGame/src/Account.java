/*
 * Tyler Patterson
 * March 2017
 */

public class Account {

	private enum ASSETS {Grain, Hay, Fruit, Cows}
	private double balance;
	private double debt;
	private int grain;
	private int hay;
	private int fruit;
	private int cow;
	
	public Account() {
		balance = 0;
		debt = 0;
		grain = 10;
		hay = 10;
		fruit = 0;
		cow = 0;
	}

	public double getBalance() {
		return balance;
	}

	public double getDebt() {
		return debt;
	}
	
	public int getGrain() {
		return grain;
	}

	public void setGrain(int grain) {
		this.grain = grain;
	}

	public int getHay() {
		return hay;
	}

	public void setHay(int hay) {
		this.hay = hay;
	}

	public int getFruit() {
		return fruit;
	}

	public void setFruit(int fruit) {
		this.fruit = fruit;
	}

	public int getCow() {
		return cow;
	}

	public void setCow(int cow) {
		this.cow = cow;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setDebt(double debt) {
		this.debt = debt;
	}
	
	public String showAssets() {
		return "Assets: " + "Cows: " + cow + " acres, Fruit: " + fruit + " acres, Hay: " + hay + " acres, Grain: " + grain + " acres."; 
	}

	@Override
	public String toString() {
		return "Account: Balance: $" + balance + ", Debt: $ " + debt + "\n Assets: " + "Cows: " + cow + " acres, Fruit: " + fruit + " acres, Hay: " + hay + " acres, Grain: " + grain + " acres.";
	}
	
}
