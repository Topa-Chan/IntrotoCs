import java.util.Scanner;

public class StringReader {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Please Enter A Message: ");
		String Message = scan.nextLine();
		
		for (int i = 0; i < Message.length(); i++) {
			System.out.println(Message.charAt(i));
		}
	}

}
