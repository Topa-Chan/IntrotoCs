
public class PairOfDice {

	private Die die1;
	private Die die2;
	
	public PairOfDice() {
		die1 = new Die();
		die2 = new Die();
	}
	
	public void roll() {
		die1.roll();
		die2.roll();
	}

	public int sum() {
		int sum = die1.getFaceValue() + die2.getFaceValue();
		return sum;
	}
	
}
