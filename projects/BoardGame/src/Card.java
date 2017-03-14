
public class Card {

	enum TYPE {Move, Goto}
	
	private String text;
	private int value;
	private TYPE action;
	
	public Card(String text, int value, TYPE action) {
		this.text = text;
		this.value = value;
		this.action = action;
	}

	public int getValue() {
		return value;
	}

	public TYPE getAction() {
		return action;
	}

	@Override
	public String toString() {
		return this.text;
	}
	
}
