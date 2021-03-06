/*
 * Tyler Patterson
 * 2 March 2017
 */

import java.util.Random;

public class DeckOfCards {

	private Card[] cards;
	private Random rand = new Random();
	
	public DeckOfCards() {
		cards = new Card[52];
		
		cards[0] = new Card(Card.SUIT.Heart, Card.FACE.Ace);
		cards[1] = new Card(Card.SUIT.Heart, Card.FACE.Two);
		cards[2] = new Card(Card.SUIT.Heart, Card.FACE.Three);
		cards[3] = new Card(Card.SUIT.Heart, Card.FACE.Four);
		cards[4] = new Card(Card.SUIT.Heart, Card.FACE.Five);
		cards[5] = new Card(Card.SUIT.Heart, Card.FACE.Six);
		cards[6] = new Card(Card.SUIT.Heart, Card.FACE.Seven);
		cards[7] = new Card(Card.SUIT.Heart, Card.FACE.Eight);
		cards[8] = new Card(Card.SUIT.Heart, Card.FACE.Nine);
		cards[9] = new Card(Card.SUIT.Heart, Card.FACE.Ten);
		cards[10] = new Card(Card.SUIT.Heart, Card.FACE.Jack);
		cards[11] = new Card(Card.SUIT.Heart, Card.FACE.Queen);
		cards[12] = new Card(Card.SUIT.Heart, Card.FACE.King);
		cards[13] = new Card(Card.SUIT.Spade, Card.FACE.Ace);
		cards[14] = new Card(Card.SUIT.Spade, Card.FACE.Two);
		cards[15] = new Card(Card.SUIT.Spade, Card.FACE.Three);
		cards[16] = new Card(Card.SUIT.Spade, Card.FACE.Four);
		cards[17] = new Card(Card.SUIT.Spade, Card.FACE.Five);
		cards[18] = new Card(Card.SUIT.Spade, Card.FACE.Six);
		cards[19] = new Card(Card.SUIT.Spade, Card.FACE.Seven);
		cards[20] = new Card(Card.SUIT.Spade, Card.FACE.Eight);
		cards[21] = new Card(Card.SUIT.Spade, Card.FACE.Nine);
		cards[22] = new Card(Card.SUIT.Spade, Card.FACE.Ten);
		cards[23] = new Card(Card.SUIT.Spade, Card.FACE.Jack);
		cards[24] = new Card(Card.SUIT.Spade, Card.FACE.Queen);
		cards[25] = new Card(Card.SUIT.Spade, Card.FACE.King);
		cards[26] = new Card(Card.SUIT.Club, Card.FACE.Ace);
		cards[27] = new Card(Card.SUIT.Club, Card.FACE.Two);
		cards[28] = new Card(Card.SUIT.Club, Card.FACE.Three);
		cards[29] = new Card(Card.SUIT.Club, Card.FACE.Four);
		cards[30] = new Card(Card.SUIT.Club, Card.FACE.Five);
		cards[31] = new Card(Card.SUIT.Club, Card.FACE.Six);
		cards[32] = new Card(Card.SUIT.Club, Card.FACE.Seven);
		cards[33] = new Card(Card.SUIT.Club, Card.FACE.Eight);
		cards[34] = new Card(Card.SUIT.Club, Card.FACE.Nine);
		cards[35] = new Card(Card.SUIT.Club, Card.FACE.Ten);
		cards[36] = new Card(Card.SUIT.Club, Card.FACE.Jack);
		cards[37] = new Card(Card.SUIT.Club, Card.FACE.Queen);
		cards[38] = new Card(Card.SUIT.Club, Card.FACE.King);
		cards[39] = new Card(Card.SUIT.Diamond, Card.FACE.Ace);
		cards[40] = new Card(Card.SUIT.Diamond, Card.FACE.Two);
		cards[41] = new Card(Card.SUIT.Diamond, Card.FACE.Three);
		cards[42] = new Card(Card.SUIT.Diamond, Card.FACE.Four);
		cards[43] = new Card(Card.SUIT.Diamond, Card.FACE.Five);
		cards[44] = new Card(Card.SUIT.Diamond, Card.FACE.Six);
		cards[45] = new Card(Card.SUIT.Diamond, Card.FACE.Seven);
		cards[46] = new Card(Card.SUIT.Diamond, Card.FACE.Eight);
		cards[47] = new Card(Card.SUIT.Diamond, Card.FACE.Nine);
		cards[48] = new Card(Card.SUIT.Diamond, Card.FACE.Ten);
		cards[49] = new Card(Card.SUIT.Diamond, Card.FACE.Jack);
		cards[50] = new Card(Card.SUIT.Diamond, Card.FACE.Queen);
		cards[51] = new Card(Card.SUIT.Diamond, Card.FACE.King);
	}
	
	public void shuffle() {
		for (int i = 0; i < cards.length; i++) {
			int r = rand.nextInt(cards.length);
			if (cards[r] != null) {
				System.out.println(cards[r]);
			} else {
				r = rand.nextInt(cards.length);
			}
			cards[r] = null;
		}
	}
}
