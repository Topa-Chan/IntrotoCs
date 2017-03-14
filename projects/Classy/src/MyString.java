
public class MyString {
	
	private String value;
	private long[] namelong;
	
	public MyString() {
		
	}

	public MyString(String value) {
		this.value = value;
	}
	
	public int length() {
		return this.value.length();
	}
	
	public MyString(long[] value) {
		String temp = "";
		for (int i = 0; i < value.length; i++) {
			temp += (char) value[i];
		}
		this.value = temp;
	}
	
	public long[] name() {
		return this.namelong;
	}
	
	@Override
	public String toString() {
		return this.value;
	}

}
