import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class TPA3 {

	static Scanner scan = new Scanner(System.in);
	static BufferedReader scann = new BufferedReader(new InputStreamReader(System.in));
	static Random rand = new Random();

	public static void main(String[] args) throws IOException {

		boolean valid = false;

		do {
			System.out.println("Main Menu");
			System.out.println("1. Calculate the hypotenuse of a right triangle.");
			System.out.println("2. Reverse a message.");
			System.out.println("3. Play High/Low.");
			System.out.println("4. Exit.");
			System.out.print("Make a selection: ");

			int selection = scan.nextInt();
			if (selection == 1) {
				System.out.println();
				System.out.print("Enter side A: ");
				double a = scan.nextInt();
				System.out.print("Enter Side B: ");
				double b = scan.nextInt();
				double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
				System.out.println("The hypotenuse is: " + c);
			} if (selection == 2) {
				System.out.println();
				System.out.print("Enter A Message: ");
				String message = scann.readLine();
				for (int x = message.length() - 1; x >= 0; x--) {
					System.out.print(message.charAt(x));
				}
				System.out.println();
			} if (selection == 3) {
				System.out.println();
				System.out.print("Enter the Low and High numbers seperated by a space: ");
				int low = scan.nextInt();
				int high = scan.nextInt();
				int number = rand.nextInt(low) + low;
				boolean chosen = false;
				do {
					System.out.print("Guess A Number: ");
					int guess = scan.nextInt();
					if (guess == number) {
						System.out.println("Right!");
						chosen = true;
					} if (guess > number) {
						System.out.println("Too High!");
					} if (guess < number) {
						System.out.println("Too Low!");
					}
				} while(!chosen);
				System.out.println(number);
			} if (selection == 4) {
				System.out.println();
				System.out.println("Bye!");
				valid = true;
			}
			System.out.println();
		} while (!valid);

	}

}