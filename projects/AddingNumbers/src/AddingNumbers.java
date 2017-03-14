
public class AddingNumbers {

	public static void main(String[] args) {
		int add;
		int sum = 0;
		for (String val: args) {
			sum += Integer.parseInt(val);
		}	
		System.out.println("The sum is: " + sum);
		
	}

}
