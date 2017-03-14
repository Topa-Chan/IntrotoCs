import java.util.Scanner;

public class ConvertingMiles {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("How Many Miles?");
		System.out.print("Enter Miles: ");
		int Miles = scan.nextInt();
		double Kilometres = Miles * 1.60935;
		System.out.println("The Number Of Kilometres For Miles Is: " + Kilometres + ".");
	}

}
