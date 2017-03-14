import java.util.Scanner;

public class LeapYear {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		String answer;
		do {
			System.out.print("Please Enter A Year To See If It Is A Leap Year: ");
			int year = scan.nextInt();
			if (year < 1582) {
				System.out.println("Please Enter A Year After 1582.");
			} else if (year >= 1582) {
				System.out.println("Okay, Calculating.");
				int determleap = year % 4;
				if (determleap == 0) {
					int fourhundleap = year % 400;
					if (fourhundleap == 0) {
						System.out.println("The Year " + year + " Is A Leap Year.");
					} else {
						int hundredleap = year % 100;
						if (hundredleap == 0) {
							System.out.println("Sorry, The Year " + year + " Is Not A Leap Year.");
						} else {
							System.out.println("The Year " + year + " Is A Leap Year.");
						}					
					}
				} else {
					System.out.println("Sorry, The Year " + year + " Is Not A Leap Year.");
				}
			}
			System.out.println("Would You Like To Try Another Year? Please Enter Yes or No.");
			answer = scan.next();
		} while (answer.equals("yes") || answer.equals("Yes"));
		System.out.println("Thank You For Trying The Leap Year Calculator!");

	}

}
