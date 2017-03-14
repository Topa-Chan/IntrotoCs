import java.util.Scanner;

/*Tyler Patterson
 * Todd Nicholes
 * CSC110
 */

public class CountingMoney {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Enter a Value of Money: ");
		float Money = scan.nextFloat();
		System.out.println("You Entered: $" + Money);
		int BillConversion = (int) (Money * 100);
		int Hundred = BillConversion / 10000;
		int Remainder = BillConversion % 10000;
		System.out.println("There Is " + Hundred + " Hundred Dollar Bill(s).");
		int Fifty = Remainder / 5000;
		System.out.println("There Is " + Fifty + " Fifty Dollar Bill(s).");
		int Remain = Remainder % 5000;
		int Twenty = Remain / 2000;
		System.out.println("There Is " + Twenty + " Twenty Dollar Bill(s).");
		Remainder = Remain % 2000;
		int Ten = Remainder / 1000;
		System.out.println("There Is " + Ten + " Ten Dollar Bill(s).");
		Remain = Remainder % 1000;
		int Five = Remain / 500;
		System.out.println("There Is " + Five + " Five Dollar Bill(s).");
		Remainder = Remain % 500;
		int One = Remainder / 100;
		System.out.println("There Is " + One + " One Dollar Bill(s).");
		Remain = Remainder % 100;
		int Quarters = Remain / 25;
		System.out.println("There Is " + Quarters + " Quarter(s).");
		Remainder = Remain % 25;
		int Dimes = Remainder / 10;
		System.out.println("There Is " + Dimes + " Dime(s).");
		Remain = Remainder % 10;
		int Nickles = Remain / 5;
		System.out.println("There Is " + Nickles + " Nickle(s).");
		Remainder = Remain % 5;
		int Pennies = Remainder / 1;
		System.out.println("There Is " + Pennies + " Penny(ies).");
		
	}

}
