
public class Animal {

	enum TYPE {Pig, Cow, Horse, Emu}
	private String name;
	private TYPE type;
	
	public Animal (TYPE type, String name) {
		this.type = type;
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name + " Is A " + this.type;
	}
	
	
}
