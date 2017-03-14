
public class Board {
	
	private static int BOARD_SIZE = 25;

	public static void main(String[] args) {
		
		Deck deck = new Deck();
		int position = 0;
		Card card;
		int turns = 0;
		
		do {
			card = deck.getCard();
			
			System.out.println(card);
			
			if (card.getAction() == Card.TYPE.Goto) {
				position = 10;
			} else if (card.getAction() == Card.TYPE.Move) {
				position += card.getValue();
			}
			
			if (position < 0) {
				position = 0;
			}
			
			System.out.println(position + "/" + BOARD_SIZE);
			turns++;
			
//			if(card.getAction() == Card.TYPE.Foward) {
//				position += card.getValue();
//			} else if(card.getAction() == Card.TYPE.Backward) {
//				position -= card.getValue();
//			}
			
			System.out.println();
			
		} while(position < BOARD_SIZE);

		System.out.println("You Win! It took you " + turns + " turns.");
	}

}
