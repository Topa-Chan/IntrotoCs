import java.util.Scanner;

public class LetsDoMath {

	static Scanner scan = new Scanner(System.in);
			
	public static void main(String[] args) {
		System.out.print("Enter First Number: ");
		int firstNumber = scan.nextInt();
		System.out.print("Enter Second Number: ");
		int secondNumber = scan.nextInt();
		int Sum = firstNumber + secondNumber;
		int Difference = firstNumber - secondNumber;
		int Product = firstNumber * secondNumber;
		System.out.println("The Sum Is: " + Sum);
		System.out.println("The Difference Is: " + Difference);
		System.out.println("The Product Is: " + Product);
	}

}
