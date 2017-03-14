import java.util.Random;

public class Die {
	
	Random rand = new Random();
	int value;

	public Die() {
		roll();
	}

	public int roll() {
		value = rand.nextInt(6) + 1;
		return value;
	}
}
