
public class SnakeEyes {

	public static void main(String[] args) {
		
		PairOfDice pair = new PairOfDice();

		int snakeEyes = 0;
		for (int i = 1; i <= 100; i++) {
			pair.roll();
			if (pair.sum() == 2) {
				snakeEyes++;
			}
		}
		System.out.println("There Were " + snakeEyes + " Snake Eyes In 100 Rolls.");

	}

}
