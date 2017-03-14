import java.util.Random;

public class Deck {

	private Card[] cards;
	private Random rand = new Random();
	
	public Deck() {
		cards = new Card[14];
		
		cards[0] = new Card("Move X 1.", 1, Card.TYPE.MoveX);
		cards[1] = new Card("Move X 2.", 2, Card.TYPE.MoveX);
		cards[2] = new Card("Move X 3.", 3, Card.TYPE.MoveX);
		cards[3] = new Card("Move X -1.", -1, Card.TYPE.MoveX);
		cards[4] = new Card("Move X -2.", -2, Card.TYPE.MoveX);
		cards[5] = new Card("Move X -3.", -3, Card.TYPE.GotoX);
		cards[6] = new Card("Go To X 8.", 8, Card.TYPE.GotoX);
		cards[7] = new Card("Move Y 1.", 1, Card.TYPE.MoveY);
		cards[8] = new Card("Move Y 2.", 2, Card.TYPE.MoveY);
		cards[9] = new Card("Move Y 3.", 3, Card.TYPE.MoveY);
		cards[10] = new Card("Move Y -1.", -1, Card.TYPE.MoveY);
		cards[11] = new Card("Move Y -2.", -2, Card.TYPE.MoveY);
		cards[12] = new Card("Move Y -3.", -3, Card.TYPE.GotoY);
		cards[13] = new Card("Go To Y 7.", 7, Card.TYPE.GotoY);
	}

	public Card getCard() {
		int index = rand.nextInt(this.cards.length);
		Card card = cards[index];
		return card;
	}
	
	public void displayAllCards() {
		System.out.println("Initialize Cards");
		for (int i = 0; i < cards.length; i++) {
			System.out.println(cards[i]);
		}
	}
	
}
