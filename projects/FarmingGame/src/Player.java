/*
 * Tyler Patterson
 * March 2017
 */

public class Player {
	
	private int position;
	private Account account;

	public Player() {
		account = new Account();
		position = 0;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}
	
}
