import java.util.Scanner;

public class Cuber {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Please Enter Two Integer Values: ");
		int x = scan.nextInt();
		int y = scan.nextInt();
		System.out.println("The First Number Cubed Is: " + Math.pow(x, 3));
		System.out.println("The Second Number Cubed Is: " + Math.pow(y, 3));
	}

}
