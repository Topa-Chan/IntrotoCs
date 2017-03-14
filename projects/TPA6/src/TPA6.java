
public class TPA6 {

	public static void main(String[] args) {
		
		if (args.length != 2) {
			System.out.println("Usage: java -jar TPA6.jar [X length] [Y length]");
		} else {
			TPA6 game = new TPA6();
			game.run(args);
		}
		
	}
	
	private void run(String[] args) {
		
		int BOARD_X = Integer.parseInt(args[0]);
		int BOARD_Y = Integer.parseInt(args[1]);
		
		boolean done = false;
		
		Deck deck = new Deck();
		int x = 0;
		int y = 0;
		int px = 0;
		int py = 0;
		Card card;
		int turns = 0;
		
		deck.displayAllCards();
		System.out.println();
		
		do {
			
			card = deck.getCard();
			
			System.out.println(card);
			
			px = x;
			py = y;
			
			if (card.getAction() == Card.TYPE.GotoX) {
				x = 8;
			} else if (card.getAction() == Card.TYPE.GotoY) {
				y = 7;
			} else if (card.getAction() == Card.TYPE.MoveX) {
				x += card.getValue();
			} else if (card.getAction() == Card.TYPE.MoveY) {
				y += card.getValue();
			}
			
			if (x < 0) {
				x = 0;
			} else if (y < 0) {
				y = 0;
			}
			
			if (x > BOARD_X) {
				x = px;
			} else if (y > BOARD_Y) {
				y = py;
			}
			
			System.out.println("Position " + x + ", " + y);
			turns++;
			
			System.out.println();
			
			if (x == BOARD_X && y == BOARD_Y) {
				done = true;
			} else {
				done = false;
			}
			
		} while(!done);

		System.out.println("You Win! It took you " + turns + " turns.");
	}

}
