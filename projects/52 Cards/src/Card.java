/*
 * Tyler Patterson
 * 2 March 2017
 */

public class Card {

	enum SUIT {Heart, Spade, Club, Diamond}
	enum FACE {Ace, Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King}
	
	private FACE number;
	private SUIT shape;
	
	public Card (SUIT shape, FACE number) {
		this.number = number;
		this.shape = shape;
	}
	
	public FACE getNumber() {
		return number;
	}
	
	public SUIT getShape() {
		return shape;
	}

	@Override
	public String toString() {
		return "Card: Number: " + number + " , Suit: " + shape;
	}
	
}
