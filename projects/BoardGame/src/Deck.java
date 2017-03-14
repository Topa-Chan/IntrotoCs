import java.util.Random;

public class Deck {

	private Card[] cards;
	private Random rand = new Random();
	
	public Deck() {
		cards = new Card[6];
		
		cards[0] = new Card("Move Foward 1 space.", 1, Card.TYPE.Move);
		cards[1] = new Card("Move Foward 3 spaces.", 3, Card.TYPE.Move);
		cards[2] = new Card("Move Foward 5 spaces.", 5, Card.TYPE.Move);
		cards[3] = new Card("Move Backwards 2 spaces.", -2, Card.TYPE.Move);
		cards[4] = new Card("Move Backwards 4 spaces.", -4, Card.TYPE.Move);
		cards[5] = new Card("Go To 10.", 10, Card.TYPE.Goto);
	}

	public Card getCard() {
		int index = rand.nextInt(this.cards.length);
		Card card = cards[index];
		return card;
	}
	
}
