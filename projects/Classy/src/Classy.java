
public class Classy {

	public static void main(String[] args) {
		
		MyString myString = new MyString("This is a test.");
		System.out.println(myString.length());
		System.out.println(myString);
		
		long[] namelong = {'J','i','m'};
		MyString myName = new MyString(namelong);
		System.out.println(myName.length());
		System.out.println(myName);
		
		System.out.println(MyMath.pow(2, 3));
		
	}

}
