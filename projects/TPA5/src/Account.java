
public class Account {

	public enum TYPE {Savings, Checking}
	private String name;
	private TYPE type;
	private double balance;
	
	public Account (String name, TYPE type, double balance) {
		this.name = name;
		this.type = type;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [Name: " + name + ", Type: " + type + ", Balance: " + balance + "]";
	}
	
	
}
