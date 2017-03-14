import java.util.Random;
import java.util.Scanner;

public class UserNameGen {

	static Scanner scan = new Scanner(System.in);
	static Random rand = new Random();
	
	public static void main(String[] args) {
		System.out.print("Please Enter Your First Name: ");
		String FirstName = scan.next();
		System.out.print("Please Enter Your Last Name: ");
		String LastName = scan.next();
		int UserNumber = rand.nextInt(90) + 10;
		System.out.print("Your User Name Is: " + FirstName.charAt(0));
		System.out.print(LastName.substring(0, 5));
		System.out.print(UserNumber);

	}

}
